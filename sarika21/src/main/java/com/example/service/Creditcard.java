package com.example.service;

import com.example.service.CardPayment;

public class Creditcard  implements CardPayment
{
	public Creditcard()
	{
		System.out.println("Credit Card Section");
	}
	
public void sayHello()
{
	System.out.println("Hello,Spring Dependency Injection!");
}

}
