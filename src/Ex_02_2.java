import java.util.Scanner;

public class Ex_02_2 {
public static void main(String[] args) {
	Scanner imp = new Scanner(System.in);
	int demso = 0;
	System.out.print("Nhap n : ");
	int n = imp.nextInt();
	System.out.print("Uoc so cua n = ");
	for (int i = 1; i <= n; i++) {
		if (i % 2 == 0) {
			System.out.print(+i + " ");
			demso++;
		}

	}
	System.out.print("\nVay so cac uoc so cua n nhap vao la : " + demso + " so ");
}
}
