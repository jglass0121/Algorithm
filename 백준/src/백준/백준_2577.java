package 백준;

import java.util.Scanner;


public class 백준_2577 {
	/*
	 * 세 개의 자연수 A, B, C가 주어질 때 
	 * A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는
	 * 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("곱할 숫자 3개를입력 하세요");
		int ar[] = new int[10];
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c =scan.nextInt();
		int multi = a *b*c;
		while(multi>0) {
			ar[multi%10]++;
			multi/=10;
		}
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
}
