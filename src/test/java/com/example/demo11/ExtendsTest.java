package com.example.demo11;

import org.junit.jupiter.api.Test;

public class ExtendsTest {

	@Test
	public void animalTest() {
		Animal ani = new Animal();
		ani.setName("ANI");
		ani.eat();
		ani.sleep();
	}

	@Test
	public void birdTest() {
		Bird bird = new Bird();
		bird.setName("Bird");
		bird.eat();
		bird.sleep();
		bird.flying();
	}

	@Test
	public void animalTest2() {
		Animal ani = new Animal("ANI", 5);
		ani.eat();
		ani.sleep();
	}

	@Test
	public void birdTest2() {
		Bird bird = new Bird("Bird", 5);
		bird.eat();
		bird.sleep();
		bird.flying();
		bird.flying2();
	}

	@Test
	public void birdTest3() {
		// ���M���^�Ӫ���ƫ��A�O�����O�A���]�� new �X�Ӫ���ҬO�l���O�A�ҥH����W�N�O�l���O
		Animal bird = new Bird("Bird", 5);
		// eat() �M sleep() ���檺��@���e�|�O�b�l���O�����s�w�q��@���e
		bird.eat();
		bird.sleep();
		// �H�U2�Ӥ�k�L�k�Q�I�s�A�]���S���w�q�b�����O��
//		bird.flying();
//		bird.flying2();
		// ��X�H�W�A��s�إߥX�Ӫ��l���O��Ҩ䱵������ƫ��A�O�����O��
		// 1. �u��I�s�w�q�b�����O������k
		// 2. ��l���O�����s�w�q�����O����k�ɡA���檺���G�|�O�l���O����@���e
	}

	@Test
	public void son() {
		Son son = new Son("Kevin");
		son.walk();
		son.playball();
	}

	@Test
	public void daughter() {
		Doughter dou = new Doughter("Mandy");
		dou.walk();
		dou.shopping();
	}

	@Test
	public void birdTest4() {
		Bird bird = new Bird("Bird", 6);
		// ���檺�O�w�q�b Bird ������@���e
		bird.flying();
		// ���s�w�q flying() ����k
		// 1. �b�إ߷s����Үɪ��������s����@���e�A�Y�[�W�j�A��
		// 2. �j�A���n�g�b�������e�A�B�����@�w�n������
		// 3. ���s�w�q����@���e�N�Ȧ��b�o������
		// 4. @Override �i���i�L�A����ĳ�[
		Bird bird2 = new Bird("Bird", 6) {

			@Override
			public void flying() {
				System.out.println(getName() + " �³��C��");
			}
			
		};
		bird2.flying();
	}
}
