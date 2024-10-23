package com.example.demo11;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

public class Lec5Test {
	
	private String stringTes;
	@Test
	public void mathTest() {
		int a = Math.max(9, 2);
		int b = Math.min(a, 7);
		System.out.println(a);
		System.out.println(b);
		int c = Math.max(2, Math.max(1, 99));//要比較三個值以上，必須兩個兩個比(Max,Min的方法)
		System.out.println(c);
		int d = (int) (Math.random()*(10));
		System.out.println(d);
		int e =(int) Math.round(3.4);
		System.out.println(e);
		int f = (int)Math.round(3.5);
		System.out.println(f);
		int f1 = (int)Math.rint(2.5);//rint 小數點是5時，回傳最接近的偶數值
		int f2 = (int)Math.rint(3.5);
		System.out.println(f1);
		System.out.println(f2);
		int e1 = (int)Math.ceil(2.5);
		int e2 = (int)Math.floor(2.5);
		System.out.println(e1);
		System.out.println(e2);
		int h1 = (int)Math.sqrt(9);
		int h2 = (int)Math.cbrt(64);
		System.out.println(h1);
		System.out.println(h2);
		int i = (int)Math.pow(2, 10);
		System.out.println(i);
	}
	@Test
	public void stringTest() {
		//長度
		String str = "12345678";
		String str3 = null;//無記憶體位置 無法取得
		String str4 = new String();
		int a = str.length();
		System.out.println(a);
		//isEmpty：判斷字串長度是否為 0
		//isBlank：empty 或是全為 space，都會為true
		String str1 = "";
		String str2 = " ";
		boolean a1 = str1.isEmpty();
		boolean a2 = str2.isEmpty();
		boolean b4 = str4.isEmpty();
		if(str3 != null) {
			boolean b3 = str3.isEmpty();
			System.out.printf("字串長度為:%d,isEmpty的結果為:%b",str3.length(),b3);
		}
		System.out.printf("字串長度為:%d,isEmpty的結果為:%b",str1.length(),a1);
		System.out.printf("\n字串長度為:%d,isEmpty的結果為:%b",str2.length(),a2);
		System.out.printf("\n字串長度為:%d,isEmpty的結果為:%b",str4.length(),b4);
		
		boolean a3 = str1.isBlank();
		boolean a4 = str2.isBlank();
		System.out.printf("\n字串長度為:%d,isEmpty的結果為:%b",str1.length(),a3);
		System.out.printf("\n字串長度為:%d,isEmpty的結果為:%b",str2.length(),a4);
		
		boolean b1 = StringUtils.hasLength(str1);
		boolean b2 = StringUtils.hasLength(str2);
		System.out.printf("\n字串長度為:%d,hasLength的結果為:%b",str1.length(),b1);
		System.out.printf("\n字串長度為:%d,hesLength的結果為:%b",str2.length(),b2);
		boolean b8 = StringUtils.hasText(str1);
		boolean b9 = StringUtils.hasText(str2);
		boolean b10 = StringUtils.hasText(str4);
		System.out.printf("\n字串長度為:%d,hasText的結果為:%b",str1.length(),b8);
		System.out.printf("\n字串長度為:%d,hasText的結果為:%b",str2.length(),b9);
		System.out.printf("\n字串長度為:%d,hasText的結果為:%b",str4.length(),b10);
		
		/*
		contains("搜尋內容")：判斷字串中是否存在搜尋內容
		charAt(索引位置)：return 在索引位置上的字元
		indexOf("搜尋內容")：從 index 0 開始搜尋
		return 搜尋內容第一次出現的位置（index 值）
		lastIndexOf("搜尋內容")：與前述功能相同，只是從右邊開始找起
		return 搜尋內容最後一次出現的位置
		indexOf("搜尋內容", 起始位置)：從起始位置開始搜尋
		lastIndexOf("搜尋內容", 起始位置)：從起始位置開始搜尋
		當找不到搜尋內容時，index 值會 return -1 */
		
		String s1 = " 小龍女與 楊過與楊過與楊";
		String s2 = "過";
		System.out.println();
		System.out.println(s1.contains("小"));
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf("楊"));
		System.out.println(s1.indexOf("不"));//找不到結果會回傳-1
		System.out.println(s1.lastIndexOf("楊"));
		System.out.println(s1.indexOf("楊", 4));//從第四個位置開始找第一個楊
		System.out.println(s1.indexOf("楊", 5));//從第五個位置開始找第一個楊
		System.out.println(s1.lastIndexOf("楊", 10));
		System.out.println(s1.lastIndexOf("楊", 9));
		
		/*substring(起始位置)：return 起始位置以後的部分字串
		substring(起始位置, 結束位置)：return 起始位置以後～結束位置之前的部分字串，
		trim：去除頭和尾的space，但無法去除中間的 space
		replace(被換內容, 換成內容)：把某一個字段全部換成另一個，可以用此方法，把所有 space 去除
		concat(連接內容)：return 原字串＋連接內容
		replaceAll(正規表達字串, 換成內容)：同樣也是把某一個字段全部換成另一個
		但輸入的字段可以是 regex
		（regex：Regular Expression 正規表達式，之後會教）
		replaceFirst(正規表達字串, 換成內容)：取代第一個找到的 */
		//s1 = s1.substring(7);要用 s1 = s1.substring(7)才會改變裡面的值
		//System.out.println(s1);
		System.out.println(s1.substring(7));
		System.out.println(s1.substring(7, 9));//substring(a,b) >=a&&<b
		System.out.println(s1.substring(0, 13));
		System.out.println(s1.trim());
		System.out.println(s1.replace(" ", ""));//把空白變成空字串
		System.out.println(s1);
		System.out.println(s1.concat(s2));
		System.out.println(s1.replaceAll("與", ""));
		/*split(切割點)：return 以值作為切斷劃分的多個字串片段
		因此必須用 String Array 來儲存
		（相當於將 String 轉換成 String Array）
		會將值切割掉，使分割成斷裂的幾個字詞
		有趣的是，用 empty String 去切割，會變成一個個字
		String.join(連接內容, 字串陣列名稱)：將字串陣列的內容以輸入的連接內容直接加起來，不會有分隔
		toCharArray()：將整個字串轉換成 char Array
		getChars(起點, 終點, 字元陣列名稱, 陣列起點)：可擷取某段字串放入 char Array
		有趣的是，char 型態的陣列可以直接用變數名稱印出整個內容
		null 的地方則會印出 error block，而其他型態都只是印出記憶體位置
		String.valueOf(非字串的基本資料型態)：將非字串的基本資料型態內容轉成字串
		Integer.valueOf("字串")：將數字從 String 轉成 Integer
		Integer.parse("字串")：將數字從 String 轉成 int */
		String[] ar = s1.split("與");
		String [] ar1 = s1.split(" ");
		System.out.println(String.join("+", ar));
		//System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.toString(ar1));
		System.out.println(s1.toCharArray());
		System.out.println(Arrays.toString(s1.toCharArray()));
		char[] ch = new char[2];
		System.out.println(ch);
		s1.getChars(7, 9, ch, 0);
		System.out.println(ch);
		
		
		String q1 = String.valueOf(1);
		String q2 = String.valueOf(true);
		String q3 = String.valueOf(0.0);
		q1 = 1+"";
		
		Integer z1 = Integer.valueOf("1");
		int z2 = Integer.parseInt("1");
	}
	@Test
	public void classTest() {
		String sr1 = "AABCBDCDACBDA";
		String sr2 = "BACBDCADBC";
		this.stringTes(sr1); 
		this.stringtest(sr2);
	}
	
	public void stringTes(String sr1) {
		int Ta,Tb,Tc,Td;
		Ta=Tb=Tc=Td=0;
	    char temp;
	    for (int i = 0; i < sr1.length(); i++) {
	      temp = sr1.charAt(i);
	      if (temp == 'A') {
	    	  Ta++;
	      }
	      if (temp == 'B') {
	    	  Tb++;
	      }
	      if (temp == 'C') {
	    	  Tc++;
	      }
	      if (temp == 'D') {
	    	  Td++;
	      }
	    }
	    System.out.println("總共有" + Ta + "個A "+ Tb +"個B "+ Tc +"個C "+ Td +"個D");
	  }
	public void stringtest(String sr2) {
		String [] a1 = sr2.split("");
		int a = 0,b= 0,c=0,d=0;
		for(int i = 0;i<sr2.length();i++) {
			switch(a1[i]) {
			case "A":
				a++;
				break;
			case "B":
				b++;
				break;
			case "C":
				c++;
				break;
			case "D":
				d++;
			}
		}
		System.out.printf("%d個A %d個B %d個C %d個D",a,b,c,d);
	}
	public void m1(String str) {
		
	}
	public void m2(String str) {
		int a = 0;
		this.m2brunch(str, str);
	}
	public int m2brunch(String str,String target) {
		int i = 0;
		int count = 0;
		while(str.indexOf("A",i)!=-1) {
			count++;
			i = str.indexOf("A",i)+1;
		}
		return count;
	}
	// replace：藉由原本的長度和剩下的長度，推算少了幾個值
		public void m3(String str) {
			String[] targetArr = {"A", "B", "C", "D"};
			int[] countArr = new int[4];   // 0:A的數目，1：B的數目，2：C的數目，3：D的數目
			for(int i = 0; i < targetArr.length; i++) {
				if(str.length()==0) {
					break;
				}
				int old = str.length();
				str = str.replace(targetArr[i], "");
				int newest = str.length();
				countArr[i] = old - newest;			
			}
		}
	}
	

