package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;

public class bai16 {

	public static void main(String[] args) {
		//Viết chương trình kiểm tra xem năm nhập vào có phải năm nhuận hay không?
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("Nhập vào số năm: ");
		year = Integer.parseInt(sc.nextLine());
		if(isLeapYear(year)) {
			System.out.println(year + " Là một năm nhuận");
		}else {
			System.out.println(year + " Không phải là một năm nhuận");
		}
	}
	public static boolean isLeapYear(int n) {
		return (((n % 4 == 0 ) && (n % 100  != 0)) || (n % 400 ==0));
	}

}
