package cybersoft.javabackend.java16.exercise;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*
 	Viết chương trình cho phép nhập vào số phần tử và từng phần tử của một mảng.
	Xóa đi các phần tử bị lặp lại.
*/
public class bai14 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		List<Integer> arr = new ArrayList<Integer>();
		System.out.println("Nhập số phần tử: ");
		n = sc.nextInt();
		input(arr,n);
		Set<Integer> newArr = new LinkedHashSet<Integer>();
		newArr.addAll(arr);
		
		System.out.print("Mãng đã nhập: ");
		showArrlist(arr);
		System.out.println();
		System.out.print("Mãng sau khi xóa những pt trùng: ");
		show(newArr);
		
		
	}
	public static void input(List<Integer> arr,int size) {
		int num;
		for (int i = 0; i < size; i++) {
			System.out.print("Nhập phần tử "+ (i+1) + " :");
			num = sc.nextInt();
			arr.add(num);
		}
	}
	public static void showArrlist(List<Integer> arr) {
		for (Integer integer : arr) {
			System.out.print(integer + " ");
		}
	}
	public static void show(Set<Integer> arr) {
		for (Integer integer : arr) {
			System.out.print(integer + " ");
		}
	}
}
