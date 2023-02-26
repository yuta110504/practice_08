import java.util.Scanner;

public class Ex_05 {
	public static void main(String[] args) {
		Scanner imp = new Scanner(System.in);
		int demso = 0;
		for (long i = 1; i <= 1000; i++) {
			if (i % 10 == 0) {
				System.out.print(+i + " ");
				demso++;
				// moi lan bien dem tang len neu chia het cho 5 th in ra 5 so 1 hang
				if (demso % 5 == 0)
					System.out.println(" ");
			}

		}
	}
}
