package com.example.demo11;

public class Dog {
	//�ŧi�ݩ�(�S��)
	String category;
	
	String color;
	
	String name;
	
	int age;
	
	//�w�q��k(�欰)
	public void run() {
		System.out.println("���b�]!!");
	}
	//��k���h��(overload)
	//1.��k�W�٤@�ˡA���O��k�����ѼƭӼƤ��@�ˡA�I�srun�ɤ�k�i�H�P�_�O�I�s���L�Ѽƪ���k
	public void run(String name) {
		System.out.println("���b�]!!");
	}
	//2.��k�W�٤@�ˡA��k�����ѼƭӼƤ@�ˡA���O�ۦP��m���Ѽƪ���ƫ��A���@��
	public void run(int age,String name) {
		System.out.println("���b�]!!");
	}
	public void run(String name,int age) {
		System.out.println("���b�]!!");
	}
	
	public void running() {
		System.out.println(name + "���b�]!!" );
	}
	
	public void eat(String name1) { //�Ĥ@�ؤ覡�����ܼƦW��
		//�L�X:�p�g�ܷR�Y�ܦ��D�g
		System.out.println(name + "�ܷR�Y�ܦ�" + name1);
	}
	
	public void eatting(String name) { //�ĤG�ؤ覡��This.name
		//�L�X:�p�g�ܷR�Y�ܦ��D�g
		System.out.println(this.name + "�ܷR�Y�ܦ�" + name);
	}
	
}
