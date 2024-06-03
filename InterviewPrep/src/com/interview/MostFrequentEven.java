package com.interview;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MostFrequentEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(mostFrequentEven()); 

	}
	
	public static int mostFrequentEven() {
        int[] nums = {0,1,2,2,4,4,1};
        SortedMap<Integer, Integer> sortedMap = new TreeMap<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0)
                sortedMap.put(nums[i], sortedMap.getOrDefault(nums[i],0)+1);
        }
        int max = 0;
        int lowest = 0;
        for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()){    
            if(entry.getValue() > max){
                max = entry.getValue();
                lowest = entry.getKey();
            }
        }
        return lowest;
    }

}
