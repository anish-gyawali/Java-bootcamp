package com.takeo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.takeo.model.Book;

public class App {
	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\takeo\\config\\spring.xml"));
		Book book = (Book) factory.getBean("bk");
		System.out.println(book.getBno() + "\t" + book.getBname() + "\t" + book.getBauthor());
	}
}
