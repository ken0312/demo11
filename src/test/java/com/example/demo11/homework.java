package com.example.demo11;

import org.junit.jupiter.api.Test;

public class homework {
		@Test
		public  void Homework() {
			System.out.println("����"+'\n'+"�ᶡ�@���s�A"+'\n'+"�W�u�L����;"+'\n'+"�|�M�ܩ���A"+'\n'+"��v���T�H�C");
			System.out.println("�ڷRJava");
			System.out.println("Java�O�@�ӥ\��j�j���{���y��");
			System.out.println(this.homework("Java"));
			System.out.println(this.homework2("Java"));
		}
		public String homework(String instring) {
			return "�ڷR"+instring;
		}
		public String homework2(String instring2) {
			return instring2 + "�O�@�ӥ\��j�j���{���y��";
		}
}
