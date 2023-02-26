import java.util.Iterator;
import java.util.Scanner;

public class Ex_04 {
	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		int a, b;
		System.out.println("Nhap a :");
		a = imp.nextInt();
		System.out.println("Nhap b :");
		b = imp.nextInt();
		System.out.print("So chia het cho 3 & 5 tu a den b la : ");
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.print(+i + " ");

		}
	}
}
