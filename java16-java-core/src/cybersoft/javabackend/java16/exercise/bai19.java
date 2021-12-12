package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;

/*
 * Viết chương trình giải phương trình bậc 1 và bậc 2. Trình bày dưới dạng
 * menu cho phép lựa chọn.
*/
public class bai19 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n, choose;
		do {
			menu();
			choose = sc.nextInt();
			switch (choose) {
			case 1:
				ptBac1();
				break;
			case 2:
				ptBac2();
				break;
			case 3:
				System.out.println("Goodbye!");
				break;
			default:
				System.err.println("Nhập lỗi!");
				break;
			}

		} while (choose != 3);

	}

	public static void ptBac1() {
		float a, b;
		System.out.println("Nhập vào hệ số a: ");
		a = sc.nextFloat();
		System.out.println("Nhập vào hệ số b: ");
		b = sc.nextFloat();
		System.out.println("PT: " + a + "x + " + b + " = 0");
		giaiPtBac1(a, b);

	}

	public static void giaiPtBac1(float a, float b) {
		double x;
		if (a == 0) {
			if (b == 0)
				System.out.println("PT vô số nghiệm");
			else
				System.out.println("PT vô nghiệm");
		} else {
			x = (double) -b / a;
			System.out.println("PT có nghiệm x = " + x);
		}
	}

	public static void ptBac2() {
		float a, b, c;
		double delta;
		System.out.print("Nhập hệ số a: ");
		a = sc.nextFloat();
		System.out.print("Nhập hệ số b: ");
		b = sc.nextFloat();
		System.out.print("Nhập hệ số c: ");
		c = sc.nextFloat();
		System.out.println("PT: " + a + "x^2 " + b + "x " + c + " = 0");
		giaiPtBac2(a, b, c);
	}

	public static void giaiPtBac2(float a, float b, float c) {
		float delta, x1, x2;
		if (a == 0) {
			giaiPtBac1(b, c);
			return;
		}
			
		delta = b * b - 4 * a * c;
		if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
		} else if (delta == 0) {
			x1 = (-b / (2 * a));
			System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
		}else
			 System.out.println("Phương trình vô nghiệm!");

	}

	public static void menu() {
		System.out.println("1.Giải Phương trình bật 1.");
		System.out.println("2.Giải Phương trình bật 2.");
		System.out.println("3.Thoát");
		System.out.print("Chọn: ");
	}
}
