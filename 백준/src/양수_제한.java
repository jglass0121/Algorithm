import java.util.Scanner;

public class 양수_제한 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int no;
		do {
			System.out.println("입력");
			no=sc.nextInt();
		}while(no<10||no>99);
		System.out.println(no);
	}
}
