package com.java.staticDemo;

public class Test {
	int j;
static int i=10;
static {
	m1();
	//System.out.println(j);   .......direct read from (riwo) 
	//ce: illegal forword reference
	System.out.println(i);
}
public static void m1(){
System.out.println(i);
}}
