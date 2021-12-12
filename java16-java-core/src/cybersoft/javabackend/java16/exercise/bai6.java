package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;
/*
 * Viết chương trình cho phép nhập vào một chuỗi, in ra chuỗi theo thứ tự ngược lại
 * */
public class bai6 {
	public static void main(String[] args) {
		//Đảo ngược chuỗi
		Scanner sc = new Scanner(System.in);
		String result,str;
		System.out.println("Nhập vào chuỗi kí tự: ");
		str = sc.nextLine();
		StringBuffer newStr = new StringBuffer(str);
		result = newStr.reverse().toString();
		
		System.out.println("Chuỗi bị đảo: "+result);
	}
}
