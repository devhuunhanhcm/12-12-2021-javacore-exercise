package cybersoft.javabackend.java16.exercise;

import java.util.Iterator;
import java.util.Scanner;

/*
	Viết chương trình cho phép nhập vào số tự nhiên n (từ 1 đến 9) và in ra tam giác
	vuông có độ dài tương ứng.
*/
public class bai12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhập vào chiều cao tam giác(1-9): ");
			n = sc.nextInt();
		}while(n<1 && n >9);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
