package com.example.demo11;

public class Submarine extends Boat implements Dive {

	@Override
	public void diving() {
		System.out.println("�U�礤");
		
	}

	@Override
	public void move() {
		System.out.println("���ʤ�");
	}

	
}
