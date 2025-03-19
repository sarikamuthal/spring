package com.example.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main 
{
public static void main(String[]args)
{
	ApplicationContext cx=new ClassPathXmlApplicationContext("NewFile.xml");
	//Debitcard dc =(Debitcard)cx.getBean("abcd");
	Creditcard ac =(Creditcard)cx.getBean("pqr");
	ac.sayHello();
}
}
