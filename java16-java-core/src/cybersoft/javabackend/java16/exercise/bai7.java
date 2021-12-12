package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;
/*
 	Viết chương trình cho phép nhập vào một số tự nhiên và in ra các ước số của số
	tự nhiên đó.*/
public class bai7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập vào n: ");
		n = sc.nextInt();
		System.out.print("Các ước số của"+  n + " là: ");
		for (int i = 1; i <= n; i++) {
			if(n % i == 0)
				System.out.print(i + " ");
		}
	}
}
