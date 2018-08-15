package com.servtel;

import com.tools.StudentUtils;
import org.hibernate.Session;

import javax.servlet.*;
import java.io.IOException;


public class Fuliter implements Filter {
    public void doFilter(ServletRequest arg0, ServletResponse arg1,
                         FilterChain arg2) throws IOException, ServletException {
        arg0.setCharacterEncoding("utf-8");
        arg1.setContentType("text/html;charset=utf-8");
        Session session=null;
        try {
            session= StudentUtils.getSession();
            arg2.doFilter(arg0, arg1);
            session.beginTransaction().commit();
        } catch (Exception e) {
            session.beginTransaction().rollback();
            e.printStackTrace();
        }finally{
            StudentUtils.close();
        }
    }
    @Override
    public void destroy() {

    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
}
