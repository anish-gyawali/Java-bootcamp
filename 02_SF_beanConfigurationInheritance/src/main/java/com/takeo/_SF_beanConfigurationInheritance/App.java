package com.takeo._SF_beanConfigurationInheritance;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.takeo.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory =new XmlBeanFactory(new ClassPathResource("com\\takeo\\config\\spring.xml"));
    	Employee emp=(Employee)factory.getBean("emp");
    	System.out.println(emp.getEno()+emp.getEname()+emp.getDesignation()+emp.getCity()+emp.getHo()+emp.getSa());
    }
}
