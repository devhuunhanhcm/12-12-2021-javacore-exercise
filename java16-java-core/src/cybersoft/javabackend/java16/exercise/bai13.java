package cybersoft.javabackend.java16.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Viết chương trình cho phép nhập vào số phần tử và từng phần tử của một mảng.
	Tính:
	a) Tính giá trị trung bình
	b) Tìm phần tử lớn nhất, nhỏ nhất
	c) Tìm phần tử âm lớn nhất, nhỏ nhất trong mảng
	d) Tìm phần tử dương lớn nhất, nhỏ nhất trong mảng
	e) In ra các phần tử chẵn, lẻ
	f) Thêm một phần tử theo index
	g) Xóa một phần tử theo index
*/
public class bai13 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n,length;
		int[] arr = null;
		do {
			menu();
			n = sc.nextInt();
			if(n >=1 && n < 8) {
				System.out.println("Nhập vào chiều dài mãng: ");
				length = sc.nextInt();
				arr = new int[length];
				input(arr);
			}
			switch(n) {
			case 1:
				getAvg(arr);
				break;
			case 2:
				getMinMaxValue(arr);
				break;
			case 3:
				getMinMaxNagative(arr);
				break;
			case 4:
				getMinMaxPositive(arr);
				break;
			case 5:
				getOldEvenValue(arr);
				break;
			case 6:
				addByIndex(arr);
				break;
			case 7:
				removeByIndex(arr);
				break;
			case 8:
				System.out.println("Goodbye!");
				break;
			default:
				System.err.println("Nhập lỗi!!");
				break;
			}
			
			line();
		}while(n != 8);
		
	}
	//In ra các phần tử chẵn, lẻ
	public static void getOldEvenValue(int[] arr) {
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oldList = new ArrayList<Integer>();
		for (int i : arr) {
			if(i%2==0)
				evenList.add(i);
			else 
				oldList.add(i);
		}
		if(evenList.size() == 0) 
			System.out.println("Không có phần tử nào là số chẵn");
		else {
			System.out.print("Phần tử là số chẵn là: ");
			showList(evenList);
		}
		if(oldList.size() == 0)
			System.out.println("Không có phần tử nào là số lẽ");
		else {
			System.out.print("Phần tử là số lẽ là: ");
			showList(oldList);
		}
	}
	public static void showList(List<Integer> numList) {
		for (Integer i : numList) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	//6.Thêm một phần tử theo index
	public static void addByIndex(int[] arr) {
		int k,n,temp;
		int[] newArr = new int[arr.length + 1];
		int size = newArr.length;
		for (int i = 0; i < size - 1; i++) {
			newArr[i] = arr[i];
		}
		do {
			System.out.println("Nhập vào vị trí thêm: ");
			temp = sc.nextInt();
			k = temp -1;
		}while(temp < 0 && temp > size);
		System.out.println("Nhập vào phần tử ["+ k + "]: ");
		n = sc.nextInt();
		//dịch tất cả phần tử từ vị trí k đến hết
		for (int i = size - 1; i >= k + 1; i--) {
			newArr[i] = newArr[i - 1];
		}
		newArr[k] = n;
		System.out.print("Mãng sau khi thêm "+ n + " : ");
		for (int i : newArr) {
			System.out.print(i + ", ");
		}
		
	}
	//xóa phần tử theo index
	public static void removeByIndex(int[] arr) {
		List<Integer> newList = new ArrayList<Integer>();
		int n;
		for (Integer i : arr) {
			newList.add(i);
		}
		System.out.println("Nhập vào index phần tử muốn xóa: ");
		n = sc.nextInt();
		newList.remove(n - 1);
		System.out.print("Các phần tử sau khi xóa: ");
		showList(newList);
	}
	//2.Min Max của mãng
	public static void getMinMaxValue(int[] arr) {
		int max,min;
		max = arr[0];
		min= arr[0];
		for (int i : arr) {
			if(max < i)
				max = i;
			if(min > i)
				min = i;
		}
		System.out.println("Giá trị nhỏ nhất trong mãng là: " + min);
		System.out.println("Giá trị lớn nhất trong mãng là: " + max);
	}
	//số âm nhỏ nhất lớn nhất
	public static void getMinMaxNagative(int[] arr) {
		int max = arr[0],min = arr[0];
		for (int i : arr) {
			if(i < 0) {
				if(i > max)
					max = i;
				if(i < min)
					min = i;
			}
		}
		if(min < 0 && max <0) {
			System.out.println("Phần tử số âm nhỏ nhất là: "+ min);
			System.out.println("Phần tử số âm lớn nhất là: " + max);
		}
		else 
			System.err.println("Không có phần tử âm nào!");
	}
	//số dương nhỏ nhất lớn nhất
	public static void getMinMaxPositive(int[] arr) {
		int max = arr[0],min = arr[0];
		for (int i : arr) {
			if(i > 0) {
				if(i > max)
					max = i;
				if(i < min)
					min = i;
			}
		}
		if(min > 0 && max > 0) {
			System.out.println("Phần tử số dương nhỏ nhất là: "+ min);
			System.out.println("Phần tử số dương lớn nhất là: " + max);
		}
		else 
			System.err.println("Không có phần tử dương nào!");
	}
	//Tính giá trị trung bình
	public static void getAvg(int[] arr) {
		double count = 0;
		double result;
		for (int i = 0; i < arr.length; i++) {
			count+= arr[i];
		}
		result = count/ arr.length;
		System.out.println("Giá trị trung bình của các phần tử: " + result);
	}
	//Hàm nhập
	public static void input(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Nhập phần tử ["+ (i+1)+ "]: ");
			arr[i] = sc.nextInt();
		}
	}
	public static void line() {
		System.out.println("\n----------------------------------------\n");
	}
	public static void menu() {
		System.out.println("1.Tính giá trị trung bình");
		System.out.println("2.Tìm phần tử lớn nhất, nhỏ nhất");
		System.out.println("3.Tìm phần tử âm lớn nhất, nhỏ nhất trong mảng");
		System.out.println("4.Tìm phần tử dương lớn nhất, nhỏ nhất trong mảng");
		System.out.println("5.In ra các phần tử chẵn, lẻ");
		System.out.println("6.Thêm một phần tử theo index");
		System.out.println("7.Xóa một phần tử theo index");
		System.out.println("8.Thoát");
		System.out.print("Chọn: ");
	}
}
