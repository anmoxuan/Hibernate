package com.test;

import com.dao.StudentDao;
import com.tools.StudentUtils;
import org.hibernate.Session;


public class Test {
    public static void main(String[] args) {
        Session session= StudentUtils.getSession();
        StudentDao userDao=new StudentDao();
        System.out.println(userDao.findAll());
        session.beginTransaction().commit();
        StudentUtils.close();
    }
}
