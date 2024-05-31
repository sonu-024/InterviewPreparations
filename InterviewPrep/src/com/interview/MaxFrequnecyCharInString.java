package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxFrequnecyCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		findMaxFrequency(str);
	}
	
	public static void findMaxFrequency(String str) {
		Map<Character, Integer> freqMap = new HashMap<>();
		int max = 0;
		for(int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if(freqMap.containsKey(ch)) {
				freqMap.put(ch, freqMap.get(ch) + 1);
			} else {
				freqMap.put(ch, 1);
			}
		}
		
		Character ch = null;
		for(Character c : freqMap.keySet()) {
			if(freqMap.get(c) > max) {
				max = freqMap.get(c);
				ch = c;
			}
		}
		System.out.println("Max frequecy in string is : " + max + " of character : " + ch);
	}
	

}
