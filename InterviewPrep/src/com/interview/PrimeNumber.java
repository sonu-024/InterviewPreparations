package com.interview;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int num = sc.nextInt();
		boolean isPrime = checkIsPrime(num);
		if(isPrime)
			System.out.println("Prime Number");
		else 
			System.out.println("Not Prime");
	}
	
	public static boolean checkIsPrime(int num) {
		boolean isPrime = false;
		if(num == 2) {
			isPrime = true;
			return isPrime;
		}
			
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
			isPrime = true;
		}
		return isPrime;
	}

}
