package com.servtel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class SuperServlet extends HttpServlet {
    protected final void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected final void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method=request.getParameter("method");
        if(method==null)method="findAll";
        try {
            //根据当前对象，获得class文件，获得method方法(方法名，参数1.class，参数2.class...)
            Method m=this.getClass().getDeclaredMethod(method,HttpServletRequest.class,HttpServletResponse.class);
            //执行这个方法，this，执行谁的方法，并且传入参数的值
            m.invoke(this,request,response);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
