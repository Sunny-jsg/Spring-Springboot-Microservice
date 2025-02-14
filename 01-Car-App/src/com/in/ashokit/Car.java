package com.in.ashokit;

public class Car {
    /* Field injection
     
     * IEngine eng;
     
     */
	
	private IEngine eng;
	
	//Constructor injection
	 
	  public Car(IEngine eng) {
		this.eng= eng;
		
	}
	
	/* Setter Injection
	 
	 * public void setEng(IEngine eng) {
		this.eng= eng;
		
	}*/
	
	public void drive() {
		int status = eng.start();
		if(status >= 1) {
			System.out.println("Journey Started...");
		}else {
			System.out.println("Engine Trouble...");
		}
	}

}
