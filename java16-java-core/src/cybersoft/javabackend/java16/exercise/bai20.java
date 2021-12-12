package cybersoft.javabackend.java16.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai20 {
	/*
	 * Viết chương trình tách một mảng số tự nhiên được nhập từ bàn phím thành 2
	 * mảng: một mảng chẵn + một mảng lẻ
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> arrList = new ArrayList<Integer>();
		List<Integer> evenNumList = new ArrayList<Integer>();
		List<Integer> oddNumList = new ArrayList<Integer>();

		input(arrList);
		detached(arrList, evenNumList, oddNumList);
		if(!evenNumList.isEmpty()) {
			System.out.print("Các phần tử là số chẵn: ");
			showList(evenNumList);
		}
		if(!oddNumList.isEmpty()) {
			System.out.print("Các phần tử là số lẽ: ");
			showList(oddNumList);
		}
	}
	public static void showList(List<Integer> arrlist) {
		for (Integer number : arrlist) {
			System.out.print(number + " ");
		}
		System.out.println();
	}
	public static void detached(List<Integer> arrList,
			List<Integer> evenNumList, List<Integer> oddNumList) {
		for (Integer number : arrList) {
			if(number % 2 == 0) {
				evenNumList.add(number);
			}else {
				oddNumList.add(number);
			}
		}
	}
	public static void input(List<Integer> arrList) {
		Scanner sc = new Scanner(System.in);
		int n, number;
		do {
			System.out.print("Nhập vào số phần tử: ");
			n = Integer.parseInt(sc.nextLine());
		} while (n < 0);
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập vào phần tử [" + i + "]: ");
			number = Integer.parseInt(sc.nextLine());
			arrList.add(number);
		}
	}
}
