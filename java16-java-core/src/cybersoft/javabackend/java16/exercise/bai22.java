package cybersoft.javabackend.java16.exercise;

import java.util.Iterator;
import java.util.Scanner;

public class bai22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		String longestPalindrome;
		do {
			System.out.println("Enter your string: ");
			input = sc.nextLine();
		}while(input.isEmpty());
		//chuỗi Palindrome dài nhất
		longestPalindrome = longestPalindrome(input);
		if(!longestPalindrome.isEmpty()) {
			System.out.println("Chuỗi Palindrome dài nhất là: " + longestPalindrome);
			System.out.println( "Substring: "+ getSubStringOfPalindrome(longestPalindrome));
			
		}else {
			System.out.println("Chuỗi không chứa chuỗi Palindrome" );
		}
	}
	//lấy chuỗi con
	public static String getSubStringOfPalindrome(String palindrome) {
		int length = palindrome.length() / 2;
		return palindrome.substring(0,length);
	}
	public static String longestPalindrome(String input) {
		if(input.length() == 1) {
			return input;
		}
		//Cho kí tự đầu là dài nhất
		String longest = input.substring(0,1);
		for (int i = 0; i < input.length(); i++) {
			String temp;
			
			//Tâm là số lẻ
			temp = checkPalindrome(input ,i,i); 
			
			if(longest.length() < temp.length()) {
				longest = temp;
			}
			//Tâm là số chẳn
			temp = checkPalindrome(input,i,i+1); 
			if(longest.length() < temp.length()) { 
				longest = temp; 
			}
		}
		
		return longest;
	}
	public static String checkPalindrome(String input,int begin,int end) {
		while(begin >= 0 && end <= input.length() - 1 && input.charAt(begin) == input.charAt(end)) {
			begin--; 
			end++; 
		}
		return input.substring(begin+1,end);
	}
	
}
