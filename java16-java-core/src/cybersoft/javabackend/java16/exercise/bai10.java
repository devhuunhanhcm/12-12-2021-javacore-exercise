package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;
/*
 	Viết chương trình cho phép nhập vào số tự nhiên n, in ra tổng các số nguyên tố
	từ 1 đến n
*/
public class bai10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,count = 0;
		System.out.println("Nhập vào n (Số nguyên dương): ");
		n = sc.nextInt();
		if(n<2) {
			System.out.println("Từ 1 đến " + n + " không có số nguyên tố!");
		}
			
		for (int i = 2; i <= n; i++) {
			if(checkPrime(i))
				count+=i;
		}
		System.out.println("Tổng số nguyên tố từ 1 đến n là: " + count);
	}
	public static boolean checkPrime(int n) {
		if(n < 0) return false;
		for (int i = 2; i < n; i++) {
			if(n % i ==0)
				return false;
		}
		return true;
	}
}
