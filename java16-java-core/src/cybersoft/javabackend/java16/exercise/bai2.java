package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		//Chuyển đổi số từ hệ 10 sang hệ cơ số 2 
		Scanner sc = new Scanner(System.in);
		int n,m;
		String str="",d,result;
		System.out.println("Nhập vào số hệ số mười: ");
		n = sc.nextInt();
		m = n;
		while(n != 0) {
			d = (n%2) + "";
			str = str.concat(d);
			n = n / 2;
		}
		StringBuffer newStr = new StringBuffer(str);
		result = newStr.reverse().toString();
		System.out.println("(" +m+ ")10 = " + "(" + result + ")2");
		
		
	}

}
