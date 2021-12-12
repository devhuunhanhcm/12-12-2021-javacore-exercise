package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Bai17 {

	public static void main(String[] args) {
		/*
		 * Chương trình cho phép máy tính phát sinh ngẫu nhiên một số từ 1 đến 1000.
		 * Người dùng sẽ đoán và nhập, nếu đúng với kết quả của máy, game sẽ dừng.
		 * Ngược lại máy sẽ báo bạn đang nhập một số lớn hơn hoặc nhỏ hơn số bí mật
		 */
		Scanner sc = new Scanner(System.in);
		boolean isWinner = false,result;
		int secretNumber;
		do {
			System.out.println("\n-Welcome to the number guessing game-");
			int input = input();
			secretNumber = ThreadLocalRandom.current().nextInt(1,1001);
			result = checkResult(input,secretNumber);
			if(result) {
				isWinner = true;
				System.out.println("SeeYa!!");
			}
		}while(!isWinner);

	}
	public static boolean checkResult(int input,int result) {
		if(input == result) {
			System.out.println("The result is: "+ result + " Congratulations!You have won this game!!");
			return true;
		}else if(input > result) {
			System.out.println("The result is: "+ result +  " The number you entered is less than the result!");
		}else {
			System.out.println("The result is: "+ result + " The number you entered is greater than the result!");
		}
		return false;
	}
	public static int input() {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("Enter number (1-1000): ");
			n = Integer.parseInt(sc.nextLine());
		}while(n > 0 && n > 1000);
		return  n;
	}
	

}
