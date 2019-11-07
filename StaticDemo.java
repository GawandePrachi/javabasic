package com.java.staticDemo;

public class StaticDemo {
static int i=10;
static{
	m1();
	System.out.println("Fist static block");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
m1();
System.out.println("main method");
	}
public static void m1(){
	System.out.println(j);
}
static int j=20;
}
