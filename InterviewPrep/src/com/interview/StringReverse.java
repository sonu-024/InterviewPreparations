package com.interview;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		System.out.println("Reversed String : " + reverse(str));
		
	}
	
	public static String reverse(String str) {
		String rev = "";
		char[] ch = str.toCharArray();
		
		for(int i = ch.length-1; i >= 0 ; i--) {
			rev += ch[i];
		}
		return rev;
	}

}
