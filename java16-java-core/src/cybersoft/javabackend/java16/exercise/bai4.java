package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;
/*
	Viết chương trình cho phép nhập vào một số tự nhiên và in ra tổng các chữ số
	của số tự nhiên đó.
 */
public class bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m,count = 0;
		System.out.print("Nhập vào n (nguyên dương): ");
		n = sc.nextInt();
		m = n;
		while(m>0) {
			count+= m%10;
			m/= 10;
		}
		System.out.println("Tổng các số tự nhiên của "+n +  " là : " + count);
	}
}
