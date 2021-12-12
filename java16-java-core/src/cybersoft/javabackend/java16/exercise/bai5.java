package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;
/*
	Viết chương trình nhập vào tọa độ A(x1, y1) và B(x2, y2) trên hệ trục toạ độ Oxy.
	Tính và in ra độ dài đoạn thẳng AB
*/
public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xA,yA;
		double xB,yB;
		System.out.print("Nhập tọa độ biển A: \nxA = ");
		xA = sc.nextDouble();
		System.out.print("yA = ");
		yA = sc.nextDouble();
		System.out.print("Nhập tọa độ biển B:\nxB = ");
		xB = sc.nextDouble();
		System.out.print("yB = ");
		yB = sc.nextDouble();
		double result = getLength(xA,yA,xB,yB);
		System.out.println("Chiều dài AB là: " + result);
	}
	public static double getLength(double xA,double yA,double xB,double yB) {
		return Math.sqrt(Math.pow(xB - xA,2) + Math.pow(yB - yA,2));
	}
}
