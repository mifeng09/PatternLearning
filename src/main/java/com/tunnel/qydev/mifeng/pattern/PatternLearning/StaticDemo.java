package com.tunnel.qydev.mifeng.pattern.PatternLearning;

class Value{
	private static int a = 0;
	static int c = 0;
	static void inc(){
		c++;
	}
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		Value.a = a;
	}
	public static int getC() {
		return c;
	}
	public static void setC(int c) {
		Value.c = c;
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
		Value v1, v2;
		v1 = new Value();
		System.out.println(Value.c);
		System.out.println("Value.a = "+Value.getA());
		v1.inc();
		v1.setA(7);
		v2 = new Value();
		System.out.println(v2.c);
		System.out.println("v2.a="+v2.getA());
		System.out.println("value.a="+Value.getA());
	}

}
