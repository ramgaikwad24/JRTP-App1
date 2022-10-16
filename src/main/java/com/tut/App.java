package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int a=120;
        System.out.println( "Hello World!" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Student st=new Student();
        st.setId(104);
        st.setName("ganu");
        st.setCity("nanded");
        System.out.println(st);
        
        Employee emp=new Employee();
        emp.setId(201);
        emp.setName("Archana");
        emp.setDesignation("Account");
        System.out.println(emp);
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(st);
        session.save(emp);
        tx.commit();
        session.close();
        
        
       // System.out.println(factory);
        //System.out.println(factory.isClosed());
    }
}
