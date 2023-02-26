import java.util.Scanner;

public class Ex_02 {
	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		// Khoi tao bien dem = 0 & nhap bien n
		int demso = 0;
		System.out.print("Nhap n : ");
		int n = imp.nextInt();
		System.out.print("Uoc so cua n = ");
		/*
		 * De in ra so luong uoc cua n : 
		 * B1 : cho i chay tu 1 den n , moi lan nv i se tang len 1. 
		 * B2 : Neu i chia het cho 2 thi chinh la uoc so cua n. 
		 * B3 : Sau moi lan chia lay uoc so cho n , bien dem se tang len 1 lan cho moi lan chia lay uoc cua n.
		 * KL : Tu do bien dem se tinh so lan in ra uoc cua n , day la so cac uoc cua n .
		 * 
		 */
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(+i + " ");
				demso++;
			}

		}
		System.out.print("\nVay so cac uoc so cua n nhap vao la : " + demso + " so ");
	}
}
