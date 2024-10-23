package com.example.demo11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

	
public class HelloTest {
	@Test
	public void HelloTest() {	
		System.out.println("我愛Java");
		System.out.println(this.HellO("hello "));
		System.out.println(this.Hello2("hello ","bye ","test "));
		System.out.println(this.Hello3("car ","home ","wallet "));
		}
	public String HellO(String instring){
		return instring +"worid";
		
	}
	public String Hello2(String ...instring) {
		return instring[2] + "world";
	}
	public String Hello3(String ...instrings) {
		return instrings[0] + "price";
	}
	public void staticFinalTest() {
		System.out.println();
	}
	@Test
	public void Test() {
		int x = 5;
		short y = (byte)3;
		int z = 4;
		long d = 6L;
		System.out.println(x);
		float g = (float)0.5;
		double j = 0.05;
		char i = '1';
		char p = 66;
		boolean o = true; 
		System.out.println(p);
		float res = 7/2;
		System.out.println(res);
		int add = 1,add2 = 2;
		this.add(add,add2);
	}
	private void add(int add, int add2) {
		// TODO Auto-generated method stub
		
	}
	public void commentTest() {
		// 單位註解
		/*
		 * 
		 */
		this.fileCommentTest(0);
	}
	public String fileCommentTest(int test) {
		return null;
	}
	
	@Test
	public void computeTest() {
		int remaidar = 10%3;//%找是餘數
		int quotient = 10/3;
		System.out.println("10除以3的餘數是" + remaidar);
		System.out.println("10除以3的商數是" + quotient);
		
		int a = 10;
		System.out.println(a);
		System.out.println(a++*10);
		System.out.println(a);
		System.out.println("----------------");
		
		a=10;
		System.out.println(a);
		System.out.println(++a*10);
		System.out.println(a);
	}
	@Test
	public void classTest() {
		int a = 100 ,b = 20;
		System.out.println(a+=9);
		a=100; b=20;
		System.out.println(a-=1);
		a=100; b=20;
		System.out.println(a*=5);
		a=100; b=20;
		System.out.println(a=b/5);
		a=100; b=20;
		System.out.println(a%=b);
		a=100; b=20;
		System.out.println(a=b%a);
	}
	@Test
	public void classTest2() {
	/**int a = 100 ,b = 20; 運算子程式碼
		System.out.println(a+=9);//a=109
		System.out.println(--a);//a=108
		System.out.println(a*=5);//a=540
		System.out.println(a=b/5);//a=4
		System.out.println(a%=b);//a=4
		System.out.println(a=b%a);//a=0
		boolean str1 = true;
		System.out.println(!str1);
		*/
		
		/**boolean res1 = (1!=1); 邏輯運算程式碼
		boolean res2 = (5>1);
		boolean res3 = (1<3);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res1&&res2);
		System.out.println(res1||res2);
		System.out.println(res1^res3);*/
		
	}
	@Test
	public void ClassTest1() {
		int str = this.sum(1, 100);
		System.out.println(str);
		double str1 = this.tem(100,57);
		System.out.printf("%.2f",str1);
	
		
	}
	/**
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	public int sum(int start, int end) {
		int sum =  (start+end)*(end-start+1)/2;
		return sum ;
	}/**等差數列和公式轉換程式碼
	*/
	public float tem(int t , int f) {
		double tem = f*9.0/5.0+32;//攝氏溫度轉華式溫度
		double tem1 = ((t-32)*5.0/9.0);//華式溫度轉攝氏溫度
		return (float) tem1;
	}/** 華式及攝氏溫度轉換公式程式碼
	*/
	@Test
	public void Test3() {
		int str2 = this.sum3(2);
		System.out.println(str2);
	}
	public int sum3(int end) {
		int x = 0;
		for(int i=1;i<=end;i++) {
			x+=i;
		}
		return x;
		
	}
	@Test
	public void Test4() {
		for(int i=1;i<=9;i++) {
			for(int x=1;x<=9;x++) {
				int z = i*x;
				System.out.printf("%d*%d=%2d ",i,x,z);
			}
			System.out.println();
		}
	}
	@Test
	public void Test5() {
		int i = 0,x = 0;
		while( i<100) {
			i++;
			x+= i;
			System.out.println(x);
		}
		
	}
	@Test
	public void Test6() {
		int i = 1,x = 1 ;
		while(i<=9) {
			while(x<=9) {
				int z = i*x;
				System.out.printf("%d*%d=%2d ",i,x,z);
				x++;
			}
			i++;
			x=1; // 復原內迴圈變數為1
			System.out.println();
			
		}
		
	}
	@Test
	public void Test7() {
		int i= 0,x=0;
		do {
			x+=i;
			i++;
			System.out.printf("%2d\n",x);
		}
		
		while(i<=100);
		
		
	}
	@Test
	public void case9() {
		int TEST9 = this.case1(35, 129);
		System.out.println();
	}
	public void TEST9(int h , int f){
		if(f%2==1||h%2==1) {
			System.out.println("無解");
			return;
		}
		int r = 0; 
		while(true) {
			int c = h - r;
			if(r*4+c*2==f) {
				System.out.printf("雞有%d隻，兔子有%d隻",c,r);
				break;
			}
			r++;
			if(r>h){
				System.out.println("此題無解");
				return ;
			}
		}
	}
	@Test
	public void TEST8() {
		int str = this.case1(35,120); 
		System.out.println();
	}
	public int case1(int i, int j) {
		int c = 0;
		int r;
		while(true){
			r = i-c;
			if(r<0 || c<0) {
				System.out.println("無解");
				return -1;
			}
			if(c*2+r*4==j) {
				System.out.printf("雞有%d隻,兔子有%d隻",c,r);
				break;
				
			}
			c++;
			}
		
		
		return 0;
	}
	@Test
	public void math() {
		int in=(int)(Math.random()*98)+2;//產生2~98的亂數
		
		Scanner scan = new Scanner(System.in);
		int start = 1,end = 99,ans,count=0;
		System.out.println(in);
		
		while(true) {
			count++;
			System.out.printf("請輸入一個%d到%d的數字\n",start,end);
			ans = scan.nextInt();
			
			if(ans>in&&ans<100) {
				
				end=ans;
			}
			if(ans<in&&ans>0) {
				
				start=ans;
			}
			else if(ans==in) {
				System.out.println("恭喜答對!!!");
				System.out.printf("總共猜了%d次",count);
				break;
			}
		}
	}
	@Test
	public void loopBreak() {
	a:	for(int i = 0;i < 10; i+=2) {
			System.out.println(i);
			for(int j = 1;j<10;j+=2) {
				System.out.println(j);
			//	break; //結束最近的for迴圈
				break a;//結束指定名稱的for迴圈
			}
			System.out.println("內層已結束");
		}
		System.out.println("外層已結束");
	}
	@Test
	public void Game1() {
		Scanner scan = new Scanner(System.in);
		String ans = "";
		int A = 0,count = 0;
			for(int i = 0;i<4;i++) {
			ans+=(int)(Math.random()*10);
		}
		System.out.println(ans);
		System.out.print("請隨機輸入一個四位數字:");
		while(A!=4) {
			A=0;
			int B = 0;
			boolean check[] = new boolean[4];
			for(int i = 0;i<4;i++) {
				check[i] = false;
			}
			String guess = scan.next(); 
			count++;
			for(int i=0;i<4;i++) {
				if(guess.charAt(i)==ans.charAt(i)) {
					A++;
					check[i]= true;
				}
			}
			for(int i =0;i<4;i++) {
				for(int j = 0;j<4;j++) {
					if(!check[j]&&(guess.charAt(j)==ans.charAt(i)&&guess.charAt(i)!=ans.charAt(i))) {
						B++;
						check[j]= true;
						break;
					}
				}
			}
			System.out.printf(A+"A"+B+"B");
			if(A==4) {
				System.out.println("\n你猜對了");
			}
		}
		
	}
	@Test
	public void switchTest() {
		String book = "第二章";
		switch(book) {
		case "第一章":
		System.out.println("1");
			break;
		case "第二章":
			System.out.println("2");
			break;
		default:
			System.out.println("END");
		}
		
	}
	@Test
	public void Testscore() {
		String res = this.score(72);
		System.out.println(res);
	}
	public String score(int s) {
		String res;
		switch(s/10) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
		
	}
	@Test
	public void Game2() {
		Scanner scan = new Scanner(System.in);
		int count = 0,A=0,B=0;
		String ans = "";
		boolean check[] = new boolean[4];
		Random r = new Random();
		int num[] = new int[9];
		
		
		for(int i = 0;i<9;i++) {
			num[i]=r.nextInt(9)+1;
			for(int j = 0;j<i;) {
				if(num[j]==num[i]) {
					num[i]=r.nextInt(9)+1;
					j=0;
				}
				else j++;
			}
		}
		for (int i=0; i<4; i++) {
			ans+=num[i];
		}
		System.out.println(ans);
		//char[] arr1 = {'1', '2', '3', '4'};
		//System.out.println(arr1);
		
		while(A!=4) {
			A=0;B=0;
			for (int i=0; i<4; i++) {
				ans+=num[i];
				check[i]=false;
				
			}
			System.out.print("\n請隨機輸入一個四位數字:");
			String guess =scan.next();
			count++;
			
			for(int i = 0;i<4;i++) {
				if(guess.charAt(i)==ans.charAt(i)) {//也可用ans.charAt(i);Character.forDigit(num[i], 10)
					A++;
					//System.out.println(Character.forDigit(num[i], 10)); 兩種不同寫法但結果一樣
					//System.out.println(guess.charAt(i));
				check[i]=true;
				}
			}
			
			for(int i = 0;i<4;i++) {
				for(int j =0;j<4;j++) {
					if(!check[j]&&guess.charAt(j)==ans.charAt(i)&&guess.charAt(i)!=ans.charAt(i)) {
						B++;
						check[j]=true;
						continue;
					}
				}
				
			}
			System.out.printf(A+"A"+B+"B"+"\n");
			if(A==4) {
				System.out.println("\n你猜對了");
			}
			
		}
		
		
	}
	
}
