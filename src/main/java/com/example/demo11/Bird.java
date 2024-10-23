package com.example.demo11;

public class Bird extends Animal {
	// �ϥ�����r extends ���~�� Animal ���w�����ݩʤΤ�k
	// 1. �ݩ� name �H�Φs���p���ݩʪ� getter/setter ��k
	// 2. eat,sleep ��k
	// �H�W���ݩʥH�Τ�k�b Animal �����A���ݭn�A���g�@��

	// �غc��k
	// �w�]�غc��k(�S���Ѽƪ��غc��k)
	public Bird() {
		// 1.�b�I�s�l���O���غc��k���e�A�|���I�s�����O���غc��k�A���ެO�w�]�غc��k�٬O�a���Ѽƪ��غc��k
		// 2.�Y�Ϭٲ��I�s�����O�� super() ��k�A�{���̵M�|������I�s�����O���غc��k
		super();
		System.out.println("�o�O�l���O");
	}
	// bird �� name �M age �~�Ӧۤ����O Animal�A �ҥH�a�� name �M age ���غc��k�|�h�I�s�����O��(�a�� name �M age )���غc��k
	public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	// �i�z�L����r super �ӨϥΩw�q�b�����O�� public ��k
	// �ݩ� name ���v���O private�A�u��b Animal ���O���ϥ�
	public void flying() {
		System.out.println(super.getName() + " ���b��!!");
		// �ثe Java 11���᪺�����i�H�N����r super �ٲ�
		System.out.println(getName() + " ���b��!!");
	}

	public void flying2() {
		// �]���ݩ� age �v���O protected�A�ҥH�l���O�i�����s�����ݩʡA���ݭnget()
		System.out.println("���~ " + age + " �� " + getName() + " ���b��!!");
	}
	
	// 1. �l���O�i�H���s�w�q(���P����@���e)�����O����k
	// 2. @Override �N�O�ΨӼаO�l���O���s�w�q�����O����k: �ثe��Java�����A���`���i�ٲ�
	//    2.1 @�O Annotation�A�`��:�|�b�{���X�����ѰT���A�o�ǰT���|�b�sĶ�άO����ɳQ�B�z
	// 3. �Q�l���O���s�w�q����k:
	//    3.1 �v�����i������O�p
	//    3.2 �^�Ǫ���ƫ��A�n�@��
	//    3.3 ��k�W�٩M�p�A�������ѼƼƶq�ΨC�ӰѼƪ���ƫ��A���n�@��
	//    3.4 �ߤ@�����P�N�O�j�A��������@���e
	@Override
	public void eat() {
		System.out.println(getName() + " �Y����");
	}
	
	@Override
	public void sleep() {
		System.out.println(getName() + " �Ϋܦh");
	}
	
	
}
