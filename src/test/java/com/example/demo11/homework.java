package com.example.demo11;

import org.junit.jupiter.api.Test;

public class homework {
		@Test
		public  void Homework() {
			System.out.println("李白"+'\n'+"花間一壺酒，"+'\n'+"獨酌無雙親;"+'\n'+"舉杯邀明月，"+'\n'+"對影成三人。");
			System.out.println("我愛Java");
			System.out.println("Java是一個功能強大的程式語言");
			System.out.println(this.homework("Java"));
			System.out.println(this.homework2("Java"));
		}
		public String homework(String instring) {
			return "我愛"+instring;
		}
		public String homework2(String instring2) {
			return instring2 + "是一個功能強大的程式語言";
		}
}
