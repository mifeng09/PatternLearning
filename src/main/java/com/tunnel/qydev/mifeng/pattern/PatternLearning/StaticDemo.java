package com.tunnel.qydev.mifeng.pattern.PatternLearning;

class Value{
	
	static int c = 0;
	static void inc(){
		c++;
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		Value v1, v2;
		v1 = new Value();
		System.out.println(Value.c);
		v1.inc();
		v2 = new Value();
		System.out.println(v2.c);
		if(v1.c == v2.c){
			System.out.println("v1.c is equivalent to v2.c");
		}
	}

}
