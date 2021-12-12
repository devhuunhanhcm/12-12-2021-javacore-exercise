package cybersoft.javabackend.java16.exercise;

import java.util.Scanner;

/*Chương trình tính và in số năm chờ đợi. Anh X có một số tiền nhàn rỗi. Anh
đem gởi tiết kiệm số tiền này. Anh X hy vọng rằng đến một lúc nào đó trong tương
lai anh sẽ có đủ tiền để mua một chiếc ô tô. Cho biết số tiền anh X gửi, số tiền
anh X muốn có trong tương lai và tiền lãi tiết kiệm. Hãy viết chương trình tính số
năm ít nhất mà anh X phải chờ đợi kể từ năm gởi tiền. Giả sử lãi suất tiết kiệm
không đổi, anh X không rút bớt tiền và cũng không gởi thêm tiền trong thời gian
chờ đợi.
*/
public class bai18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double funds ,amount,count,interest;
		double r,year = 0, month = 0;
		do {
			System.out.print("Nhập vào số tiền gửi ban đầu: ");
			funds = Double.parseDouble(sc.nextLine());
		}while(funds < 0);
		do {
			System.out.print("Số tiền mong muốn để rút: ");
			amount = Double.parseDouble(sc.nextLine());
		}while(amount < funds || amount < 0);
		do {
			System.out.print("Nhập lãi xuất của ngân hàng(%): ");
			r = Double.parseDouble(sc.nextLine());
		}while(r < 0 || r>100);
		r = r/100;
		do {
			//tiền lãi
			interest = funds * r * ((month * 30) / 360);
			//tổng tiền nhận
			count =  funds +interest;
			month++;
		}while(count < amount);
		//làm tròn
		year = (double) Math.ceil((month / 12)* 10) / 10;
		System.out.println("Số năm ít nhất cả lãi phải chờ là : " + year + " năm (" + month +" thang)");
	}
}



