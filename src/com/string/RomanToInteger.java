package com.string;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
	public static void main(String[] args) {
		
      	Scanner sc= new Scanner(System.in);
      	System.out.print("Enter the String :");
      	String str=sc.next();
      	RomanToInteger.roman(str);
		}

	private static void roman(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int result = 0;

		for(int i = 0; i < str.length(); i++) {
		    int curr = map.get(str.charAt(i));
		    int next = (i+1 < str.length()) ? 
		                map.get(str.charAt(i+1)) : 0;
		    
		    if(curr < next) {
		        result -= curr;
	
		    } else {
		        result += curr;
		     
		    }
		}
        System.out.println(result);
	}

}
