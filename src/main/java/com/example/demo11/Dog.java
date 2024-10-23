package com.example.demo11;

public class Dog {
	//宣告屬性(特性)
	String category;
	
	String color;
	
	String name;
	
	int age;
	
	//定義方法(行為)
	public void run() {
		System.out.println("正在跑!!");
	}
	//方法的多載(overload)
	//1.方法名稱一樣，但是方法中的參數個數不一樣，呼叫run時方法可以判斷是呼叫有無參數的方法
	public void run(String name) {
		System.out.println("正在跑!!");
	}
	//2.方法名稱一樣，方法中的參數個數一樣，但是相同位置的參數的資料型態不一樣
	public void run(int age,String name) {
		System.out.println("正在跑!!");
	}
	public void run(String name,int age) {
		System.out.println("正在跑!!");
	}
	
	public void running() {
		System.out.println(name + "正在跑!!" );
	}
	
	public void eat(String name1) { //第一種方式改變變數名稱
		//印出:小妮很愛吃變成胖妮
		System.out.println(name + "很愛吃變成" + name1);
	}
	
	public void eatting(String name) { //第二種方式用This.name
		//印出:小妮很愛吃變成胖妮
		System.out.println(this.name + "很愛吃變成" + name);
	}
	
}
