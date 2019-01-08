package com.ronak;

import org.springframework.boot.CommandLineRunner;

public class ApplicationImplementor implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		final int a;
		a= 3;
		System.out.println(a);
	}
}
