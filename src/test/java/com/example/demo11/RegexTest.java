package com.example.demo11;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class RegexTest {

	@Test
	public void regTest0() {
		// \�bjava����ܸ���Ÿ��A�ΨӸ��榳�S��N�q���Ÿ� --> �����S��N�q���Ÿ��ܦ���ª��r�� ����Ÿ��L�k��W�s�b
		// \\ -->�Ĥ@�Ӹ���Ÿ����ĤG�Ӹ���Ÿ��ܦ���ª��r��
		String pattern1 = "\\";
		System.out.println(pattern1);
		String path = "C:\\JAVA\\JavaProject\\eclipse";// �άOC:/JAVA/JavaProject/eclipse

	}

	@Test
	public void regtest() {
		// ��������X�榡:�Ʀr4�X-�Ʀr3�X-�Ʀr3�X
		// \d��ܼƦr0-9�����N�䤤�@��
		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J������X: �榡�� �Ʀr4�X-�Ʀr3�X-�Ʀr3�X");
		String str = scan.next();
		boolean check = str.matches(pattern);
		if (check) { // ���P��check == true
			System.out.println(str + " �ŦX������X�榡");
		} else {
			System.out.println(str + " ���ŦX������X�榡");
		}
		// System.out.println(str.matches(pattern));

		// ===============================================
		// �W�����ܼ� str.matches(pattern) �����G���ܼ� check ���^��
		// ���b���򪺵{���X���A�ܼ� check �u�ϥΤF�@��
		// �ҥH�i�H�ϥΰΦW(���ݭn���ܼƦW�٨ӱ��p�⪺���G)���覡�ӧ�g
		if (str.matches(pattern)) { // ���P��check == true
			System.out.println(str + " �ŦX������X�榡");
		} else {
			System.out.println(str + " ���ŦX������X�榡");
		}

	}

	@Test
	public void regtest1() {
		// ��������X�榡:�Ʀr4�X-�Ʀr3�X-�Ʀr3�X
		// \d��ܼƦr0-9�����N�䤤�@��
		// String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
		// �ϥ�{}�ӳB�zpattern�����ƥX�{���r��A���ȭ�{}�e�������Ӧr��
		// String pattern = "\\d{4}-\\d{3}-\\d{3}";
		// �W�@��-\\d{3} ���ƥX�{2���A -\\d{3}�O�]�t�F-,\\d,{3} �o�T�Ӧr��
		// �ҥH�ݭn��()�p�A���N�T�Ӧr��ئb�@�_(-\\d{3})�A�A�Τj�A���B�z���ƪ��r��
		String pattern = "\\{4}(-\\d{3}){2}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J������X: �榡�� �Ʀr4�X-�Ʀr3�X-�Ʀr3�X");
		String str = scan.next();

		if (str.matches(pattern)) { // ���P��check == true
			System.out.println(str + " �ŦX������X�榡");
		} else {
			System.out.println(str + " ���ŦX������X�榡");
		}

	}

	@Test
	public void regtest2() {
		// ���ܮ榡1:�Ʀr2�X-�Ʀr7�X
		// ���ܮ榡2:(�Ʀr2�X)-�Ʀr7�X
		String pattern = "\\d{2}-\\d{7}";
		String pattern1 = "\\(\\d{2}\\)-\\d{7}";
		Scanner scan = new Scanner(System.in);
		System.out.println("�п�J���ܸ��X: �榡�� �Ʀr2�X-�Ʀr7�X��(�Ʀr2�X)-�Ʀr7�X");
		String str = scan.next();
		if (str.matches(pattern) || str.matches(pattern1)) {
			System.out.println(str + " �ŦX���ܸ��X�榡");
		} else {
			System.out.println(str + " ���ŦX���ܸ��X�榡");
		}
		// ===============================================
		// �X�� pattern �� pattern1
		String pattern2 = "\\d{2}-\\d{7}|\\(\\d{2}\\)-\\d{7}";
		if (str.matches(pattern2)) {
			System.out.println(str + " �ŦX���ܸ��X�榡");
		} else {
			System.out.println(str + " ���ŦX���ܸ��X�榡");
		}
		String pattern3 = "(\\d{2}-|\\(\\d{2}\\))-\\d{7}";
		if (str.matches(pattern3)) {
			System.out.println(str + " �ŦX���ܸ��X�榡");
		} else {
			System.out.println(str + " ���ŦX���ܸ��X�榡");
		}
	}

	@Test
	public void regtest3() {
		// ���ܮ榡:�Ʀr2�X-�Ʀr7�X�μƦr8�X
		String pattern = "\\d{2}-(\\d{7}|\\d{8})";
		// \\d{7,8}���\\d�ܤ֥X�{7���ܦh�X�{8��
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
		String pattern1 = "[A-CSW-Z]";// ���g�k�ŦX���r���u�� A B C S W X Y Z
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
			//System.out.println("��J�榡���~");
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
			//System.out.println("��J�榡���~");
		//}else {
			System.out.println(str.matches(pattern1));
			System.out.println(str.matches(pattern2));
		//}
	}
}
