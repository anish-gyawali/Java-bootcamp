package com.takeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.takeo.model.College;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("com\\takeo\\config\\spring.xml");

        College clz=(College)ctx.getBean("clg");

        clz.display(); 
    }
}
