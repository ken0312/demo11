package com.example.demo11;

import org.junit.jupiter.api.Test;

public class MyInterfaceTest {

	@Test
	public void interfaceTest() {
		MyInterface my = new MyInterfaceImpl();
		System.out.println(my.num);
		System.out.println(MyInterface.num1);
	}
	
	@Test
	public void classTest() {
		Human hm = new Human();
		Person pe = new Person();
		Car car = new Car();
		hm.run();
		pe.run();
		car.run();
	}
	@Test
	public void classTest1() {
		Submarine sub = new Submarine();
		sub.diving();
		sub.move();
	}
}
