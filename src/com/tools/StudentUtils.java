package com.tools;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class StudentUtils {
    private static SessionFactory factory;
    private static ThreadLocal<Session> local=new ThreadLocal<Session>();
    static {
       factory=new Configuration().configure().buildSessionFactory();
    }
    public static Session getSession(){
        Session session=local.get();
        if(session==null){
            session=factory.openSession();
            local.set(session);
        }
        return session;
    }
    public static void close(){
        Session session=local.get();
        local.set(null);
        if(session!=null){
            session.close();
        }
    }
}
