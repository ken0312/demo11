package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec6Test {
	@Test
	public void classTest() {
		int a = 5;
		String str = "abc";//�u���r��i�H������ȵ���,��L���O(class)���n��new����
		String str1 = new String();//new �u�����O(class)�ϥΡA8�Ӱ򥻸�ƫ��A�����
		Integer b = 20;//class ���w�]�Ȭ� null
		Integer c = new Integer(30);//�X�{�@�b=����ĳ�o�˨ϥ�
		//=======================================
		int aaa;//�w�]�Ȭ�0
		Integer bbb;//�w�]�Ȭ�null �]��Integer�O���O(class)
	}
	@Test
	public void stringTest() {
		String str = "abc";
		str = str+"ABC";//str = abcABC
		System.out.println(str);
	}
	@Test
	public void stringTest2() {
		String str = "abc";
		String str1 = "abc";
		String str2 = new String("abc");//new �|���@�ӷs���O�����m
		System.out.println(str==str1);
		System.out.println(str1==str2);//����O�����m
		System.out.println(str1.equals(str2));//����r�ꪺ��
	}
	@Test
	public void stringbufferTest() {//StringBuffer�о�
		StringBuffer strBuf = new StringBuffer("abc") ;
		strBuf.append("ABC");
		strBuf.append("DEF").append("GHI");
		System.out.println(strBuf.toString());
		System.out.println(strBuf.reverse());
	}
	@Test
	public void stringreversTest() {
		String str = "abcde";//����5
		String[] strArray =str.split(""); //[a,b,c,d,e]
									// index 0 1 2 3 4
		String newstr = "";
		for(int i =str.length()-1;i>=0;i--) {
			String item = strArray[i];
			newstr =  newstr + item;
			//�Ĥ@��i = 4;item = "e"; newstr�q""-->""+"e" = "e"
			//�ĤG��i = 3;item = "d"; newstr�q""-->"e"+"d" = "ed"
			//�ĤT��i = 2;item = "c"; newstr�q""-->"ed"+"c" = "edc"
			//�ĥ|��i = 1;item = "b"; newstr�q""-->"edc"+"b" = "edcb"
			//�Ĥ���i = 0;item = "a"; newstr�q""-->"edcb"+"a" = "edcba"
		}//�|�Ni--���j��{}�����@���~����
		System.out.println(newstr);
		//===================================
		StringBuffer strBuf = new StringBuffer(str);//StringBuffer ��reverse�Ϊk �r�ꤺ�e����
		strBuf = strBuf.reverse();
		System.out.println(strBuf);
	}
	
	@Test
	public void tttTest() {
		int a = 5;
		if(a>=18) {
			System.out.println("�~��:"+ a);
			System.out.println("�w���~");
		}else {
			System.out.println("�����~");
		}
	}
}
