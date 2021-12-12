package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;

/*Cho 2 con kangaroo ở tren cùng 1 đường, vị trí dương. Cho x1, x2 lần lượt là địa
chỉ của kan1 và kan2; v1, v2 lần lượt là vận tốc của kan1 và kan 2.
Điều kiện: 0 <= x1 < x2 < 10000; 1 <= v1, v2 <= 10000
Sau 1 lần nhảy, vị trí 2 con kan sẽ tăng thêm bằng đúng vận tốc của từng con
Hỏi là 2 con kan có gặp nhau được hay không. Các số x1, x2, v1, v2 được nhập từ
bàn phím
*/
public class bai21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isMeet = false;
		int x1,v1;
		int x2,v2;
		float t,v,s;
		int point = 0;
		do {
			System.out.println("Nhập vị trí con Kangaroo 1: ");
			x1 = Integer.parseInt(sc.nextLine());
			System.out.println("Nhập vị trí con Kangaroo 2: ");
			x2 = Integer.parseInt(sc.nextLine());
		}while(x1 < 0 || x1 > x2 || x2 > 10000);
		
		do {
			System.out.println("Nhập vận tốc của con Kangaroo 1: ");
			v1 = Integer.parseInt(sc.nextLine());
			System.out.println("Nhập vận tốc của con Kangaroo 2: ");
			v2 = Integer.parseInt(sc.nextLine());
		}while(v1 < 0 || v2 > 10000);
		
		
		if(v1 > v2) {
			while(x1 <=10000 && x2 <= 10000) {
				x1 += v1;
				x2 += v2;
				if(x1 == x2) {
					point = x1;
					isMeet = true;
					break;
				}
			}
		}
		if(isMeet) {
			System.out.println("Hai con gặp nhau ở vị trí: " +point);
		}else {
			System.out.println("Hai con không thể gặp nhau");
		}

			
		
	}
}
