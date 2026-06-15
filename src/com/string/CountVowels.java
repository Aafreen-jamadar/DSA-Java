package com.string;

import java.util.Scanner;

public class CountVowels {
	  public static void main(String[] args) {
			
      	Scanner sc= new Scanner(System.in);
      	System.out.print("Enter the String :");
      	String str=sc.next();
      	CountVowels.vowels(str);
		}

	  private static void vowels(String str) {
		   int count=0;
		  for(int i=0;i<str.length();i++)
			  
		  {
			  char c=str.charAt(i);
			  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u' ||
					  c=='A'||c=='E'||c=='I'||c=='O'||c=='U'  )
			  {
				  count++;
			  }
		  }
	  	  System.out.println("The Name " +str+ " contains total " +count+ " vowels");
		
	  }
}
