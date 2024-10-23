package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexTest {

	@Test
	public void regTest0() {
		// \在java中表示跳脫符號，用來跳脫有特殊意義的符號 --> 讓有特殊意義的符號變成單純的字串 跳脫符號無法單獨存在
		// \\ -->第一個跳脫符號讓第二個跳脫符號變成單純的字串
		String pattern1 = "\\";
		System.out.println(pattern1);
		String path = "C:\\JAVA\\JavaProject\\eclipse";// 或是C:/JAVA/JavaProject/eclipse

	}

	@Test
	public void regtest() {
		// 比對手機號碼格式:數字4碼-數字3碼-數字3碼
		// \d表示數字0-9的任意其中一個
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入手機號碼: 格式為 數字4碼-數字3碼-數字3碼");
		String str = scan.next();
		boolean check = str.matches(pattern);
		if (check) { // 等同於check == true
			System.out.println(str + " 符合手機號碼格式");
		} else {
			System.out.println(str + " 不符合手機號碼格式");
		}
		// System.out.println(str.matches(pattern));

		// ===============================================
		// 上面的變數 str.matches(pattern) 的結果用變數 check 接回來
		// 但在後續的程式碼中，變數 check 只使用了一次
		// 所以可以使用匿名(不需要用變數名稱來接計算的結果)的方式來改寫
		if (str.matches(pattern)) { // 等同於check == true
			System.out.println(str + " 符合手機號碼格式");
		} else {
			System.out.println(str + " 不符合手機號碼格式");
		}

	}

	@Test
	public void regtest1() {
		// 比對手機號碼格式:數字4碼-數字3碼-數字3碼
		// \d表示數字0-9的任意其中一個
		// String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		// 使用{}來處理pattern中重複出現的字串，但僅限{}前面的那個字串
		// String pattern = "\\d{4}-\\d{3}-\\d{3}";
		// 上一行-\\d{3} 重複出現2次， -\\d{3}是包含了-,\\d,{3} 這三個字串
		// 所以需要用()小括號將三個字串框在一起(-\\d{3})，再用大括號處理重複的字串
		String pattern = "\\{4}(-\\d{3}){2}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入手機號碼: 格式為 數字4碼-數字3碼-數字3碼");
		String str = scan.next();

		if (str.matches(pattern)) { // 等同於check == true
			System.out.println(str + " 符合手機號碼格式");
		} else {
			System.out.println(str + " 不符合手機號碼格式");
		}

	}

	@Test
	public void regtest2() {
		// 市話格式1:數字2碼-數字7碼
		// 市話格式2:(數字2碼)-數字7碼
		String pattern = "\\d{2}-\\d{7}";
		String pattern1 = "\\(\\d{2}\\)-\\d{7}";
		Scanner scan = new Scanner(System.in);
		System.out.println("請輸入市話號碼: 格式為 數字2碼-數字7碼或(數字2碼)-數字7碼");
		String str = scan.next();
		if (str.matches(pattern) || str.matches(pattern1)) {
			System.out.println(str + " 符合市話號碼格式");
		} else {
			System.out.println(str + " 不符合市話號碼格式");
		}
		// ===============================================
		// 合併 pattern 跟 pattern1
		String pattern2 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
		if (str.matches(pattern2)) {
			System.out.println(str + " 符合市話號碼格式");
		} else {
			System.out.println(str + " 不符合市話號碼格式");
		}
		String pattern3 = "(\\d{2}-|\\(\\d{2}\\))-\\d{7}";
		if (str.matches(pattern3)) {
			System.out.println(str + " 符合市話號碼格式");
		} else {
			System.out.println(str + " 不符合市話號碼格式");
		}
	}

	@Test
	public void regtest3() {
		// 市話格式:數字2碼-數字7碼或數字8碼
		String pattern = "\\d{2}-(\\d{7}|\\d{8})";
		// \\d{7,8}表示\\d至少出現7次至多出現8次
		String pattern1 = "(\\d{2}|\\(\\d{2}\\))-\\d{7,8}";
		String pattern2 = "0\\d{1,3}-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(str.matches(pattern1));
		System.out.println(str.matches(pattern2));
	}

	@Test
	public void regTest4() {
		String pattern = "[A-z]";
		String pattern1 = "[A-CSW-Z]";// 此寫法符合的字母只有 A B C S W X Y Z
		String str = "";
		// System.out.println(str.matches(pattern1));
		String pattern2 = "0[1-9]{1,3}-\\d{7,8}";
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		System.out.println(str1.matches(pattern2));
	}

	@Test
	public void regTest5() {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String pattern = "[A-Za-z][1-2]\\d{8}";
		//if(str.length()!=10) {
			//System.out.println("輸入格式錯誤");
		//}else {
			System.out.println(str.matches(pattern));
		//}
	}

	@Test
	public void regTest6() {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String pattern = "[[A-Za-z]&&[^ABDEFH]][1-2]\\d{8}";
		String pattern1 = "[A-Za-z&&[^ABDEFHabdefh]][1-2]\\d{8}";
		String pattern2 = "[\\w&&[^ABDEFHabdefh0-9_]][1-2]\\d{8}";
		//if(str.length()!=10) {
			//System.out.println("輸入格式錯誤");
		//}else {
			System.out.println(str.matches(pattern1));
			System.out.println(str.matches(pattern2));
		//}
	}
}
