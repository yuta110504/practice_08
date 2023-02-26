import java.util.Scanner;

public class Ex_01 {
public static void main(String[] args) {
	Scanner imp = new Scanner(System.in);
	System.out.println("Hay nhap n : ");
	int n = imp.nextInt();
	// cho i lui tu 100 den n ; neu i sau khi lui modilo het cho 2 thi in ra cac so chan tu 100 lui den n
	for (int i = 100; i >= n ; i--) {
		if( i % 2 == 0 ) 
			System.out.println(+i+" ");
	}
}
}
