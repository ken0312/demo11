package com.example.demo11;

public class Bank {

	// �ᤩbranch�s���w�]�ȡA�Ӥ��O�{���������w�]��null
	private String branch = "�x�n����";

	private String user;

	private int balance;
	
	//�w�]�غc��k�A�榡: ��k���s���v�� ���O�W��(){}
	//				  public   Bank(){}
	//�w�]�غc��k --> �N�O�S���Ѽƪ��غc��k
	//�����O���S���a���Ѽƪ��غc��k�ɡA�S���Ѽƪ��غc��k�N�O�w�]�غc��k�A��ٲ����g�]�i�H�ϥ�
	//���O�����إ߱a���Ѽƪ��غc��k�ɡA�S���Ѽƪ��غc��k�N���A�O�w�]�غc��k�A�S�g�N����ϥ�
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//	�a���Ѽƪ��غc��k��@���e���P�� setXXX ��k�A��ڧ@�Φb���ֵ{���X���
	public Bank(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}



	// �إ��ݩʪ��s(get)��(set)��k
	// �@���k
	// �榡:��k���s���v�� ��k���^�ǭȪ���ƫ��A ��k�W��(�ѼƸ�ƫ��A �Ѽ��ܼƦW��){��k����@���e}
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

	// �s��
	void saving(int ammount) {
		System.out.println("�s�ګe�l�B:" + balance);
		// �P�_ ammount �O�_������
		if (ammount >= 0) {
			// �쥻�����B+�s�ڪ��B
			balance += ammount; // balance = balance + ammount;
			System.out.println("�s�ګ�l�B:" + balance);
		} else {
			System.out.println("�s�ڪ��B���ର�t��");
		}

	}

	// ����
	void withfraw(int ammount) {
		System.out.println("���ګe���B:" + balance);
		// ���ڪ��B>�s�ڪ��B��ܾl�B����
		if (ammount > balance) {
			System.out.println("�l�B�����A���ڥ���");
			return;
		}
		//�ư����B���t��
		if (ammount <0) {
			System.out.println("���ڤ��o���t��"); 
			return;
		}
		  balance -= ammount; // balance = balance - ammount;
			System.out.println("���ګ�l�B:" + balance);
	}
	
	public Bank withfraw2(String branch) {//���O�z�Lnew�إߥX�ӡA�]���^�ǭn�[�Wnew
		return new Bank();
	}
	
	public Bank withfraw3(String title,String branch,String user,int balance) {
		return new Bank();
	}
	
	public static Bank withfraw31(String title,String branch,String user,int balance) {
		return new Bank();
	}
	
	public Bank withfraw4(int balance,String...params) {//�@�Ӥ�k�u�঳�@�ӥi�ܰѼơA�åB�@�w�u���b�̥k��
		// params �O�}�C�A�]�t title branch user
		String title = params[0];
		String branch = params[1];
		String user = params[2];
		System.out.println(title);
		System.out.println(branch);
		System.out.println(user);
		return new Bank();
	}
	
}
