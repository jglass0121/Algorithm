package 문자열;

import java.util.Scanner;

public class 나머지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] counts = new int[42];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt()%42;
			System.out.println(arr[i]);
		}
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			counts[arr[i]]++;
		}
		for (int i = 0; i < counts.length; i++) {
			if(counts[i]!=0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
