package com.java.staticDemo;

public class Test1 {
static int x=10;
static {
	System.out.println(x);
}
}
//nosuchamethodEroor main
class Test2{
	static {
		System.out.println(x);
	}
	static int x=10;
}
//ileegal forwordReference
class Test3{
	static {
		m1();
	}
	public static void m1(){
		System.out.println(x);
	}
	static int x=10;
}//0
no such a method error main