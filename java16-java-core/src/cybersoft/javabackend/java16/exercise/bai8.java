package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;

/* Viết chương trình cho phép nhập vào một chuỗi viết thường,
 *  in ra chuỗi trên với các ký tự đầu tiên được viết in hoa
 */
public class bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString;
		System.out.print("Nhập vào một chuỗi kí tự: ");
		inputString = sc.nextLine();
		
		System.out.println("Chuỗi kí tự sau khi chuyển đổi: " + convertToPascalCase(inputString));
	}

	public static String convertToPascalCase(String n) {
		boolean isSpace = true;
		char[] charArray = n.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLetter(charArray[i])) {
				if (isSpace) {
					charArray[i] = Character.toUpperCase(charArray[i]);
					isSpace = false;
				}
			} else
				isSpace = true;
		}
		return String.valueOf(charArray);
	}
}
