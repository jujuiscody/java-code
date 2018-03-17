package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("SpringBasic.xml");
	//	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("SpringBasic.xml"));
		Triangle triangle =  appContext.getBean("triangle", Triangle.class);
		triangle.draw();
		

	}

}
