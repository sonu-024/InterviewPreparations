package com.interview;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length : ");
		int n = sc.nextInt();
		System.out.println("Fibonacci : " );
		//Without recursion
		//		fibonacci(n);
		
		//With recursion
		for(int i = 0; i < n; i++) {
			System.out.println(fibo(i) + " ");
		}
	}
	
	public static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int fibo = 0;
		for(int i = 3; i <= n; i++) {
			fibo = a + b;
			a = b;
			b = fibo;
			System.out.println(fibo);
		}
	}
	
	public static int fibo(int n) {
		if(n <= 1)
			return n;
		
		return fibo(n-1) + fibo(n-2);
	}

}
