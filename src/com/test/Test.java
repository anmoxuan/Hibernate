package com.test;

import com.dao.StudentDao;
import com.entity.Clazz;
import com.entity.Student;
import com.tools.StudentUtils;
import org.hibernate.Session;

import java.util.List;


public class Test {
    public static void main(String[] args) {
        Session session= StudentUtils.getSession();

        Clazz clazz=new Clazz();
        clazz.setCname("四年级");
        Student student1=new Student();
        student1.setSname("王彤傻子");
        student1.setAge(18);
        Student student2=new Student();
        student2.setSname("王彤傻狗");
        student2.setAge(19);
        clazz.getStuden().add(student1);
        clazz.getStuden().add(student2);
        student1.setClazz(clazz);
        student2.setClazz(clazz);

        session.save(clazz);


        session.beginTransaction().commit();
        StudentUtils.close();
    }
}
