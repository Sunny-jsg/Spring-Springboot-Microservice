package com.in.ashokit;

public class PetrolEngine implements IEngine {

	@Override
	public int start() {
		System.out.println("PetrolEngine Started...");
		return 1;
	}

}
