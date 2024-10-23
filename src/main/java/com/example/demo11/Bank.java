package com.example.demo11;

public class Bank {

	// 賦予branch新的預設值，而不是程式本身的預設值null
	private String branch = "台南分行";

	private String user;

	private int balance;
	
	//預設建構方法，格式: 方法的存取權限 類別名稱(){}
	//				  public   Bank(){}
	//預設建構方法 --> 就是沒有參數的建構方法
	//當類別中沒有帶有參數的建構方法時，沒有參數的建構方法就是預設建構方法，其省略不寫也可以使用
	//類別中有建立帶有參數的建構方法時，沒有參數的建構方法就不再是預設建構方法，沒寫就不能使用
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//	帶有參數的建構方法實作內容等同於 setXXX 方法，實際作用在於減少程式碼行數
	public Bank(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}



	// 建立屬性的存(get)取(set)方法
	// 一般方法
	// 格式:方法的存取權限 方法的回傳值的資料型態 方法名稱(參數資料型態 參數變數名稱){方法的實作內容}
	//       public        String    getBranch(){}
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 存款
	void saving(int ammount) {
		System.out.println("存款前餘額:" + balance);
		// 判斷 ammount 是否為正數
		if (ammount >= 0) {
			// 原本的金額+存款金額
			balance += ammount; // balance = balance + ammount;
			System.out.println("存款後餘額:" + balance);
		} else {
			System.out.println("存款金額不能為負數");
		}

	}

	// 提款
	void withfraw(int ammount) {
		System.out.println("提款前金額:" + balance);
		// 提款金額>存款金額顯示餘額不足
		if (ammount > balance) {
			System.out.println("餘額不足，提款失敗");
			return;
		}
		//排除金額為負數
		if (ammount <0) {
			System.out.println("提款不得為負數"); 
			return;
		}
		  balance -= ammount; // balance = balance - ammount;
			System.out.println("提款後餘額:" + balance);
	}
	
	public Bank withfraw2(String branch) {//類別透過new建立出來，因此回傳要加上new
		return new Bank();
	}
	
	public Bank withfraw3(String title,String branch,String user,int balance) {
		return new Bank();
	}
	
	public static Bank withfraw31(String title,String branch,String user,int balance) {
		return new Bank();
	}
	
	public Bank withfraw4(int balance,String...params) {//一個方法只能有一個可變參數，並且一定只能放在最右邊
		// params 是陣列，包含 title branch user
		String title = params[0];
		String branch = params[1];
		String user = params[2];
		System.out.println(title);
		System.out.println(branch);
		System.out.println(user);
		return new Bank();
	}
	
}
