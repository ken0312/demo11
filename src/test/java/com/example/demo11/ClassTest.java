package com.example.demo11;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class ClassTest {
	
	@Test
	public void dogTest(){
		//使用關鍵字 new 建立實例(instance)
		Dog mydog = new Dog();
		//設定每個實例不同的屬性(特性)
		mydog.category = "柴犬";
		mydog.color = "淺黃";
		mydog.name = "小妮";
		mydog.age = 8;
		
		System.out.println("狗的品種:" + mydog.category);
		System.out.println("我家的狗毛色是 " + mydog.color);
		//=================================================
		//使用方法(展現行為)
		mydog.run();
		mydog.running();
		mydog.eat("胖妮");
		mydog.eatting("胖妮");
	}
	
	@Test
	public void bankTest() {
		Bank bank = new Bank();
		bank.setUser("王昱翔");
		bank.setBalance(1000);
		
		//存款
		bank.saving(5000);;
		//提款
		bank.withfraw(3000);;
		
		/*Bank bank1 = new Bank();//new 一個新物件都會指向不同的記憶體
		System.out.println("bank1:" + bank1);
		Bank bank2 = new Bank();
		System.out.println("bank2:" + bank2);
		Bank bank3 = bank1;
		System.out.println("bank3: " + bank3);
		System.out.println(bank1 == bank2);//==:只有基本資料型態是比較值，類別是比較記憶體位置
		System.out.println(bank3 == bank1);*/
	}
	@Test
	public void bankTest1() {
		Bank bank = new Bank();
		bank.setBranch("TTA");
		bank.setUser("Ken");
		bank.setBalance(3000);
		//============================
		Bank bank1 = new Bank("TTB","Mandy",2000);
		System.out.println("===============");
	}
	@Test
	public void bankTest2() {
		//withfraw31是靜態方法(static)，可以直接透過類別名稱.靜態方法 呼叫
		Bank.withfraw31("title","TTA", "Mandy", 1000);
		//withfraw3 是一般方法，必須要先把類別new出來後才能呼叫
		Bank bank = new Bank();
		bank.withfraw3("title","TTA", "Ken", 500);
		//================================
		Math.random();
		
		
		Random ran = new Random();
		ran.nextInt(0,0);
	}
	
	@Test
	public void stringTest() {
		String str = "ABCADCMK";
		String newstr = str.replace("A", "Z");
		String newstr1 = str.replaceAll("A", "Z");
		System.out.println(newstr);
		System.out.println(newstr1);
		String newstr2 = str.replaceAll("[A-C]", "Z");
		System.out.println(newstr2);
	}
	
}
