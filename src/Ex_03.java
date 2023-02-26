import java.util.Scanner;

public class Ex_03 {
public static void main(String[] args) {
	Scanner imp = new Scanner(System.in);
	long a , b ;
	System.out.print("Nhap vao a : ");
	a = imp.nextLong();
	System.out.print("Nhap vao b : ");
	b = imp.nextLong();
	System.out.println("a^b = "+ Math.pow(a, b) );
}
}
