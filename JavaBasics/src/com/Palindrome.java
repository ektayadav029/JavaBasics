package com;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			String str; 
			str= "Ekta" ;
			String reverse = null;
			int i;
			   for(i=0;i<str.length()-1;i--);
			   { 
			   reverse = reverse + str.charAt(i);
			   }
			if (str.equals (reverse))
			System.out.println("Given string is palindrome"); 
			else
			System.out.println("Given string is not palindrome"); 


	}

}
