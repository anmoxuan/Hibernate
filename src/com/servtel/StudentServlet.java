package com.servtel;

import com.dao.StudentDao;
import com.entity.Student;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StudentServlet extends SuperServlet {
    private StudentDao studentDao=new StudentDao();
    protected  void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setAttribute("list",studentDao.findAll());
         request.getRequestDispatcher("index.jsp").forward(request,response);
    }
    protected  void findOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listOne",studentDao.findOne(Integer.parseInt(request.getParameter("sid"))));
        request.getRequestDispatcher("MyJsp.jsp").forward(request,response);
    }
    protected  void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student=new Student();
        student.setSname(request.getParameter("sname"));
        student.setAge(Integer.parseInt(request.getParameter("age")));
        String sid=request.getParameter("sid");
        if(sid==""){
            studentDao.add(student);
        }else {
            student.setSid(Integer.parseInt(sid));
            studentDao.update(student);
        }
        response.sendRedirect("StudentServlet.do");
    }
    protected  void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        studentDao.delete(Integer.parseInt(request.getParameter("sid")));
        response.sendRedirect("StudentServlet.do");
    }


}
