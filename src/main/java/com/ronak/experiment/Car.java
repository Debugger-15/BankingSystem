package com.ronak.experiment;

import java.io.IOException;

public class Car extends Vehicle{

	
	public static void main(String args[]) throws Exception {
		Vehicle v = new Car();
		v.mileage(1, 2);
	}
	
	@Override
	public void mileage(int a, int b) throws IOException{
		System.out.println("inside mileage");
	}

}
