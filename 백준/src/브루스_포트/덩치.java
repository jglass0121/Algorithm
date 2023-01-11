package 브루스_포트;

import java.util.Scanner;

public class 덩치 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		int[] wh = new int[2];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <wh.length ; j++) {
					wh[j] =sc.nextInt();
			}
		}
	}
}
