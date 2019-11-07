package com.clc.mainoverloading;

public class B extends A{

	public static void main(String[] args) {
		System.out.println("in main string args...");
		A a=new A();
		a.main(10);

	}

}
