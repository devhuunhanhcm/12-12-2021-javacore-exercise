package cybersoft.javabackend.java16.exercise;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ManagerKaraokeApp {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String start,end;
		boolean discount;
		int hourStart,hourEnd;
		int hourBill,drinkBill;
		LocalTime startTime,endTime;
		LocalDateTime today = LocalDateTime.now();
		LocalTime nowTime = LocalTime.now(); //giờ hiện tại
		DateTimeFormatter FORMATTIME = DateTimeFormatter.ofPattern("HH:mm"); //format giờ
		do {
			System.out.print("Nhập vào giờ bắt đầu (00:00): ");
			start = sc.nextLine();
			System.out.print("Nhập vào giờ kết thúc(00:00): ");
			end = sc.nextLine();
			startTime =  LocalTime.parse(start, FORMATTIME);
			endTime =  LocalTime.parse(end, FORMATTIME);
			hourStart = startTime.getHour();
			hourEnd = endTime.getHour();
		}while(hourStart >= 24 || hourStart < 9 || hourEnd > 24 || hourEnd < hourStart );
		
		//check xem có discount hay không
		discount = checkDiscount(hourStart);
		//Gọi nước 
		drinkBill = getDrinkBill();
		//tiền giờ hát
		hourBill = hourUsed(hourStart,hourEnd);
		//bill
		showBill(drinkBill,hourBill,today,discount);
	}
	public static void showBill(int drink,int hour,LocalDateTime nowTime,boolean isDiscount) {
		float total;
		float discount = 0.2f;
		
		total = (float) (drink + hour);
		if(isDiscount) {
			total = total - (float) (drink + hour) * discount;
		}
		System.out.println("---------------------------------------");
		System.out.println("Hóa đơn ngày: " + nowTime);
		System.out.println("Nước: " + drink + "VND");
		System.out.println("Phí theo giờ: " + hour + "VND");
		if(isDiscount)
			System.out.println("Giảm giá khung giờ vàng: 20% hóa đơn");
		System.out.println("Tổng hóa đơn: " + total + "VND");
		System.out.println("Hẹn gặp lại quý khách ([^_^])");
		System.out.println("----------------------------------------");
	}
	public static int getDrinkBill() {
		int n,total;
		do {
			System.out.print("Nhập số lượng nước: ");
			n = Integer.parseInt(sc.nextLine());
		}while(n < 0);
		total = n * 10000;
		return total;
	}
	public static int hourUsed(int start,int end) {
		int total = 0;
		boolean isDiscount = false;
		int hourUsed = end - start;
		int cost = 30000;
		float discount = 0.3f;
		float afferThreeHour =(float) cost * 3 * discount;
		//Tính tiền từng phút
		for (int i = 1; i <= hourUsed; i++) {
			
			if(i > 3) {
				isDiscount = true;
			}
			if(isDiscount) {
				total += afferThreeHour;
			}else {
				total += cost;
			}
		}
		return total;
	}
	public static boolean checkDiscount(int start) {
		return (start >= 9 && start <= 17);
	}
	
}
