package com.example.demo11;

// ���������N�O�@�ө�H������A�ҥH����r abstract �i���i�L
// ���㪺�g�k�O: public abstract Interface
// �����O��H����A�L�k�ϥ�����r new �ӥͦ����
public interface MyInterface {

	//�w�q�b���������ݩ�
	// 1.�v���u��O public �άO no modifier
	// 2.�����n����l��
	int num = 10;
	public int num1 = 10;
	// 3.���㪺�g�k(�άO�Q�sĶ�᪺�g�k)�p�U
	// 4.�]���w�q�� final�A�O�ܼơA�ҥH�ܼƦW�٭n���j�g�A���P�^��r�����n�Ω��u�걵
	public static final int NUMBER = 10;
	
	// �]�������O�@�ө�H����A�ҥH�w�q�̭�����k���O��H��k
	// �u�O����r abstract �@�˥i�H�ٲ�: public abstract void fly();
	public void fly();
	
	public void flying();
	
	// �������i�H���w�]����k��@���e(���j�A��)�A���@�w�n�[�W����r default
	// �w�]��k���j��@�w�n���s�w�q
	public default void flying(String name) {
		System.out.println(name + "~~~flying");
	};
	
	// �w�q�b�������� static ��k�A�@�w�n����@���e
	// static ��k�L�k�Q���s�w�q
	public static void flying1(String name) {
		System.out.println(name + "~~~flying");
	};

}
