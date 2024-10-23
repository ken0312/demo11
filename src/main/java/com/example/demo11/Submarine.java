package com.example.demo11;

public class Submarine extends Boat implements Dive {

	@Override
	public void diving() {
		System.out.println("下潛中");
		
	}

	@Override
	public void move() {
		System.out.println("移動中");
	}

	
}
