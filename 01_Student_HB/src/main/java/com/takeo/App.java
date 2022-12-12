package com.takeo;

import com.takeo.pojo.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	//step 1: Create configuration class
    	Configuration cfg= new Configuration();
    	System.out.println(cfg.getProperty("hibernate.connection.driver_class")); 
    	
        cfg.configure("com\\takeo\\config\\hibernate.cfg.xml");
        System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
        
        //step 2: Create Session Factory class
        SessionFactory factory=cfg.buildSessionFactory();
        
        //step 3: Create Session Object
        Session ses=factory.openSession();
        
        //Non-selective operations like insert/update/delete we will open Transaction
        Transaction tx=ses.beginTransaction();
        
        //step 4: Single row operations
        Employee emp=new Employee(); //transient state 
        emp.setEno(100);
        emp.setEname("Anish");
        emp.setEaddress("hammond");
//        Integer id=(Integer) ses.save(emp); //Persistence State
//        System.out.println("Generated Id"+ id);
        
        ses.persist(emp);
        tx.commit();
        System.out.println(ses.contains(emp));//true
        
        ses.evict(emp);//detached state
        System.out.println(ses.contains(emp));//false
        
        ses.close();
        
    }
}
