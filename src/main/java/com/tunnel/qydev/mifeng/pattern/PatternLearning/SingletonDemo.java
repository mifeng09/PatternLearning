package com.tunnel.qydev.mifeng.pattern.PatternLearning;

import org.junit.Test;

class Singleton {

	private static Singleton singleton;
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}

}
 
public class SingletonDemo{
	//Singleton singleton = new Singleton();
	@Test
	public void test(){
		
		Singleton singleton = Singleton.getInstance();
		Singleton singteton2 = Singleton.getInstance();
		if(singleton == singteton2){
			System.out.println("the same address");
		}else{
			System.out.println("different address");
		}
		if(singleton.equals(singteton2)){
			System.out.println("the same address");
		}else{
			System.out.println("different address");
		}
		
	}
	
}
