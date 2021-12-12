package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;

public class bai11 {

	public static void main(String[] args) {
		//in ra số tự nhiên lớn nhất bé hơn log2(n)
		//log2(n) = log(n) / log2
		Scanner sc = new Scanner(System.in);
		int n,result;
		double numLog;
		do {
			System.out.print("Nhập vào số tự nhiên n: ");
			n = sc.nextInt();
		}while(n < 0);
		
		numLog = Math.log10(n) / Math.log10(2);
		result = (int) Math.floor(numLog);
		System.out.println("Số tự nhiên lớn nhất nhỏ hơn log2(n) là: " + result);

	}

}
