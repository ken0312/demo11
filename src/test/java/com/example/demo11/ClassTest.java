package com.example.demo11;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class ClassTest {
	
	@Test
	public void dogTest(){
		//�ϥ�����r new �إ߹��(instance)
		Dog mydog = new Dog();
		//�]�w�C�ӹ�Ҥ��P���ݩ�(�S��)
		mydog.category = "���";
		mydog.color = "�L��";
		mydog.name = "�p�g";
		mydog.age = 8;
		
		System.out.println("�����~��:" + mydog.category);
		System.out.println("�ڮa�������O " + mydog.color);
		//=================================================
		//�ϥΤ�k(�i�{�欰)
		mydog.run();
		mydog.running();
		mydog.eat("�D�g");
		mydog.eatting("�D�g");
	}
	
	@Test
	public void bankTest() {
		Bank bank = new Bank();
		bank.setUser("���R��");
		bank.setBalance(1000);
		
		//�s��
		bank.saving(5000);;
		//����
		bank.withfraw(3000);;
		
		/*Bank bank1 = new Bank();//new �@�ӷs���󳣷|���V���P���O����
		System.out.println("bank1:" + bank1);
		Bank bank2 = new Bank();
		System.out.println("bank2:" + bank2);
		Bank bank3 = bank1;
		System.out.println("bank3: " + bank3);
		System.out.println(bank1 == bank2);//==:�u���򥻸�ƫ��A�O����ȡA���O�O����O�����m
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
		//withfraw31�O�R�A��k(static)�A�i�H�����z�L���O�W��.�R�A��k �I�s
		Bank.withfraw31("title","TTA", "Mandy", 1000);
		//withfraw3 �O�@���k�A�����n�������Onew�X�ӫ�~��I�s
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
