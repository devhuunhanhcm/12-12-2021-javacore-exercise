package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;
/*
  	Viết chương trình cho phép nhập vào 2 số nguyên dương (từ 10 đến 99), in TRUE
	nếu 2 số trên có cùng một hoặc 2 chữ số, ngược lại in ra FALSE (VD: (12, 81) => true,
	(23, 89) => false)
 */
public class bai9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		boolean result;
		do {
			System.out.println("Enter a: ");
			a = sc.nextInt();
			System.out.println("Enter b: ");
			b = sc.nextInt();
		} while ((a > 99 && a < 10) || (b > 99 && b < 10));
		result = check(a, b);
		if (result) {
			System.out.println("2 số trên có cùng một hoặc 2 chữ số: " + result);
		} else
			System.out.println("2 số trên không có cùng một hoặc 2 chữ số: " + result);
	}

	public static boolean check(int a, int b) {
		int count = 0;
		char[] aArray = String.valueOf(a).toCharArray();
		char[] bArray = String.valueOf(b).toCharArray();
		for (int i = 0; i < aArray.length; i++) {
			for (int j = 0; j < bArray.length; j++) {
				char a2 = aArray[i];
				char b2 = bArray[j];
				if (a2 == b2) {
					count++;
				}
			}
		}
		if (count >= 1)
			return true;
		else
			return false;
	}
}
