package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec3Test {
	@Test
	public void recurrenceTest() {
		System.out.println(this.recurrence(100));
	}
	public int recurrence(int x) {
		if(x==1) {
			return 1;
		}
		int sum = x +this.recurrence(x-1);
		return sum;
	}
	@Test
	public void ifTest() {
		String weather = "rain";
		if(weather == "rain") {
			System.out.println("帶雨傘");
		}
		else{
			System.out.println("不用帶雨傘");
		}
		int a = 12;
		if(a>11) {
			System.out.println("你輸了");
		}
		if(a==11) {
			System.out.println("你贏了");
		}
		else {
			System.out.println("你輸了");
		}
	}
	@Test
	public void getPriceTest() {
		this.getPrice(20);
		
	}
	public int getPrice(int a) {
		int price = 100;
		if(a<=6||a>=80) {
			return(int)(price*0.2);
			
		}else if(a<=12||a>=60) {
			
			return(int)(price*0.5);
		}
		else {
			return(price);
		}
		
	}
}
