package com.java.staticDemo;

public class Base {
static int i=0;
static{
	m1();
	System.out.println("First Static block..");
}
	public static void main(String[] args) {
		m1();
		System.out.println("Main method...");
	}
	public static void m1(){
		System.out.println(j);
	}
	static int j=20;
}
