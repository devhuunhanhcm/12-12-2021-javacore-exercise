package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;
/*
  Viết chương trình cho phép nhập vào một chuỗi:
	a) In ra độ dài của chuỗi
	b) In ra ký tự (char) tại một vị trí nhất định (index)
	c) Kiểm tra xem, trong chuỗi vừa nhập có chuỗi phụ "abcdef" hay không
  */
public class Bai15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String strings = "";
		do {
			menu();
			n = Integer.parseInt(sc.nextLine());
			if(1<= n && n <= 3) {
				System.out.println("Nhập vào chuỗi bất kì: ");
				strings = sc.nextLine();
			}
			switch(n) {
			case 1:
				getLenght(strings);
				break;
			case 2: 
				getCharByIndex(strings);
				break;
			case 3:
				checkSubString(strings);
				break;
			case 4:
				System.out.println("Goodbye!");
				break;
			default: 
				System.err.println("Nhập lỗi!!");
				break;
			}
			System.out.println();
		}while(n != 4);
	}
	public static void checkSubString(String strings) {
		String subString = "abcdef";
		boolean isChecked = false;
		if(strings.contains(subString)) {
			isChecked = true;
			System.out.println("Chuỗi chứa chuỗi " + subString + " : "+ String.valueOf(isChecked) );
		}else {
			System.out.println("Chuỗi không có chứa chuỗi " + subString+ " : "+   String.valueOf(isChecked) );
		}
	}
	public static void getCharByIndex(String strings) {
		Scanner sc = new Scanner(System.in);
		int index;
		int lengthOfString = strings.length();
		do {
			System.out.println("Nhập vị trí của kí tự");
			index = Integer.parseInt(sc.nextLine());
		}while(index < 0 && index > lengthOfString);
		System.out.println("Kí tự ở vị trí thứ "+ index + " là: " + strings.charAt(index - 1) );
	}
	public static void getLenght(String n) {
		System.out.println("Độ dài của mãng là: " + n.length());
	}
	public static void menu() {
		System.out.println("1.In ra độ dài của chuỗi");
		System.out.println("2.In ra ký tự (char) tại một vị trí nhất định (index)");
		System.out.println("3.Kiểm tra xem, trong chuỗi vừa nhập có chuỗi phụ \"abcdef\"");
		System.out.println("4.Thoát");
		System.out.print("Chọn: ");
		
	}

}
