package com.dao;

import com.entity.Student;
import com.tools.StudentUtils;

import java.util.List;

public class StudentDao {
    public List findAll(){
        return StudentUtils.getSession().createCriteria(Student.class).list();
    }
    public int add(Student student){
        return (Integer) StudentUtils.getSession().save(student);
    }
    public void update(Student student){
        StudentUtils.getSession().update(student);
    }
    public void delete(Integer sid){
        StudentUtils.getSession().delete(sid);
    }
    public Student findOne(Integer sid){
        return (Student) StudentUtils.getSession().get(Student.class,sid);
    }
}
