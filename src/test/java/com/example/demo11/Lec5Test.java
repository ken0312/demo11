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
		int c = Math.max(2, Math.max(1, 99));//�n����T�ӭȥH�W�A������Ө�Ӥ�(Max,Min����k)
		System.out.println(c);
		int d = (int) (Math.random()*(10));
		System.out.println(d);
		int e =(int) Math.round(3.4);
		System.out.println(e);
		int f = (int)Math.round(3.5);
		System.out.println(f);
		int f1 = (int)Math.rint(2.5);//rint �p���I�O5�ɡA�^�ǳ̱��񪺰��ƭ�
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
		//����
		String str = "12345678";
		String str3 = null;//�L�O�����m �L�k���o
		String str4 = new String();
		int a = str.length();
		System.out.println(a);
		//isEmpty�G�P�_�r����׬O�_�� 0
		//isBlank�Gempty �άO���� space�A���|��true
		String str1 = "";
		String str2 = " ";
		boolean a1 = str1.isEmpty();
		boolean a2 = str2.isEmpty();
		boolean b4 = str4.isEmpty();
		if(str3 != null) {
			boolean b3 = str3.isEmpty();
			System.out.printf("�r����׬�:%d,isEmpty�����G��:%b",str3.length(),b3);
		}
		System.out.printf("�r����׬�:%d,isEmpty�����G��:%b",str1.length(),a1);
		System.out.printf("\n�r����׬�:%d,isEmpty�����G��:%b",str2.length(),a2);
		System.out.printf("\n�r����׬�:%d,isEmpty�����G��:%b",str4.length(),b4);
		
		boolean a3 = str1.isBlank();
		boolean a4 = str2.isBlank();
		System.out.printf("\n�r����׬�:%d,isEmpty�����G��:%b",str1.length(),a3);
		System.out.printf("\n�r����׬�:%d,isEmpty�����G��:%b",str2.length(),a4);
		
		boolean b1 = StringUtils.hasLength(str1);
		boolean b2 = StringUtils.hasLength(str2);
		System.out.printf("\n�r����׬�:%d,hasLength�����G��:%b",str1.length(),b1);
		System.out.printf("\n�r����׬�:%d,hesLength�����G��:%b",str2.length(),b2);
		boolean b8 = StringUtils.hasText(str1);
		boolean b9 = StringUtils.hasText(str2);
		boolean b10 = StringUtils.hasText(str4);
		System.out.printf("\n�r����׬�:%d,hasText�����G��:%b",str1.length(),b8);
		System.out.printf("\n�r����׬�:%d,hasText�����G��:%b",str2.length(),b9);
		System.out.printf("\n�r����׬�:%d,hasText�����G��:%b",str4.length(),b10);
		
		/*
		contains("�j�M���e")�G�P�_�r�ꤤ�O�_�s�b�j�M���e
		charAt(���ަ�m)�Greturn �b���ަ�m�W���r��
		indexOf("�j�M���e")�G�q index 0 �}�l�j�M
		return �j�M���e�Ĥ@���X�{����m�]index �ȡ^
		lastIndexOf("�j�M���e")�G�P�e�z�\��ۦP�A�u�O�q�k��}�l��_
		return �j�M���e�̫�@���X�{����m
		indexOf("�j�M���e", �_�l��m)�G�q�_�l��m�}�l�j�M
		lastIndexOf("�j�M���e", �_�l��m)�G�q�_�l��m�}�l�j�M
		��䤣��j�M���e�ɡAindex �ȷ| return -1 */
		
		String s1 = " �p�s�k�P ���L�P���L�P��";
		String s2 = "�L";
		System.out.println();
		System.out.println(s1.contains("�p"));
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf("��"));
		System.out.println(s1.indexOf("��"));//�䤣�쵲�G�|�^��-1
		System.out.println(s1.lastIndexOf("��"));
		System.out.println(s1.indexOf("��", 4));//�q�ĥ|�Ӧ�m�}�l��Ĥ@�ӷ�
		System.out.println(s1.indexOf("��", 5));//�q�Ĥ��Ӧ�m�}�l��Ĥ@�ӷ�
		System.out.println(s1.lastIndexOf("��", 10));
		System.out.println(s1.lastIndexOf("��", 9));
		
		/*substring(�_�l��m)�Greturn �_�l��m�H�᪺�����r��
		substring(�_�l��m, ������m)�Greturn �_�l��m�H��㵲����m���e�������r��A
		trim�G�h���Y�M����space�A���L�k�h�������� space
		replace(�Q�����e, �������e)�G��Y�@�Ӧr�q���������t�@�ӡA�i�H�Φ���k�A��Ҧ� space �h��
		concat(�s�����e)�Greturn ��r��ϳs�����e
		replaceAll(���W��F�r��, �������e)�G�P�ˤ]�O��Y�@�Ӧr�q���������t�@��
		����J���r�q�i�H�O regex
		�]regex�GRegular Expression ���W��F���A����|�С^
		replaceFirst(���W��F�r��, �������e)�G���N�Ĥ@�ӧ�쪺 */
		//s1 = s1.substring(7);�n�� s1 = s1.substring(7)�~�|���ܸ̭�����
		//System.out.println(s1);
		System.out.println(s1.substring(7));
		System.out.println(s1.substring(7, 9));//substring(a,b) >=a&&<b
		System.out.println(s1.substring(0, 13));
		System.out.println(s1.trim());
		System.out.println(s1.replace(" ", ""));//��ť��ܦ��Ŧr��
		System.out.println(s1);
		System.out.println(s1.concat(s2));
		System.out.println(s1.replaceAll("�P", ""));
		/*split(�����I)�Greturn �H�ȧ@�����_�������h�Ӧr����q
		�]�������� String Array ���x�s
		�]�۷��N String �ഫ�� String Array�^
		�|�N�Ȥ��α��A�Ϥ��Φ��_�����X�Ӧr��
		���쪺�O�A�� empty String �h���ΡA�|�ܦ��@�ӭӦr
		String.join(�s�����e, �r��}�C�W��)�G�N�r��}�C�����e�H��J���s�����e�����[�_�ӡA���|�����j
		toCharArray()�G�N��Ӧr���ഫ�� char Array
		getChars(�_�I, ���I, �r���}�C�W��, �}�C�_�I)�G�i�^���Y�q�r���J char Array
		���쪺�O�Achar ���A���}�C�i�H�������ܼƦW�٦L�X��Ӥ��e
		null ���a��h�|�L�X error block�A�Ө�L���A���u�O�L�X�O�����m
		String.valueOf(�D�r�ꪺ�򥻸�ƫ��A)�G�N�D�r�ꪺ�򥻸�ƫ��A���e�ন�r��
		Integer.valueOf("�r��")�G�N�Ʀr�q String �ন Integer
		Integer.parse("�r��")�G�N�Ʀr�q String �ন int */
		String[] ar = s1.split("�P");
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
	    System.out.println("�`�@��" + Ta + "��A "+ Tb +"��B "+ Tc +"��C "+ Td +"��D");
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
		System.out.printf("%d��A %d��B %d��C %d��D",a,b,c,d);
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
	// replace�G�ǥѭ쥻�����שM�ѤU�����סA����֤F�X�ӭ�
		public void m3(String str) {
			String[] targetArr = {"A", "B", "C", "D"};
			int[] countArr = new int[4];   // 0:A���ƥءA1�GB���ƥءA2�GC���ƥءA3�GD���ƥ�
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
	

