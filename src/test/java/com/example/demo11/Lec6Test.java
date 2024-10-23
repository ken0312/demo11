package com.example.demo11;

import org.junit.jupiter.api.Test;

public class Lec6Test {
	@Test
	public void classTest() {
		int a = 5;
		String str = "abc";//只有字串可以直接塞值給它,其他類別(class)都要用new給值
		String str1 = new String();//new 只能類別(class)使用，8個基本資料型態不能用
		Integer b = 20;//class 的預設值為 null
		Integer c = new Integer(30);//出現一槓=不建議這樣使用
		//=======================================
		int aaa;//預設值為0
		Integer bbb;//預設值為null 因為Integer是類別(class)
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
		String str2 = new String("abc");//new 會給一個新的記憶體位置
		System.out.println(str==str1);
		System.out.println(str1==str2);//比較記憶體位置
		System.out.println(str1.equals(str2));//比較字串的值
	}
	@Test
	public void stringbufferTest() {//StringBuffer教學
		StringBuffer strBuf = new StringBuffer("abc") ;
		strBuf.append("ABC");
		strBuf.append("DEF").append("GHI");
		System.out.println(strBuf.toString());
		System.out.println(strBuf.reverse());
	}
	@Test
	public void stringreversTest() {
		String str = "abcde";//長度5
		String[] strArray =str.split(""); //[a,b,c,d,e]
									// index 0 1 2 3 4
		String newstr = "";
		for(int i =str.length()-1;i>=0;i--) {
			String item = strArray[i];
			newstr =  newstr + item;
			//第一次i = 4;item = "e"; newstr從""-->""+"e" = "e"
			//第二次i = 3;item = "d"; newstr從""-->"e"+"d" = "ed"
			//第三次i = 2;item = "c"; newstr從""-->"ed"+"c" = "edc"
			//第四次i = 1;item = "b"; newstr從""-->"edc"+"b" = "edcb"
			//第五次i = 0;item = "a"; newstr從""-->"edcb"+"a" = "edcba"
		}//疊代i--等迴圈{}做完一次才執行
		System.out.println(newstr);
		//===================================
		StringBuffer strBuf = new StringBuffer(str);//StringBuffer 的reverse用法 字串內容反轉
		strBuf = strBuf.reverse();
		System.out.println(strBuf);
	}
	
	@Test
	public void tttTest() {
		int a = 5;
		if(a>=18) {
			System.out.println("年齡:"+ a);
			System.out.println("已成年");
		}else {
			System.out.println("未成年");
		}
	}
}
