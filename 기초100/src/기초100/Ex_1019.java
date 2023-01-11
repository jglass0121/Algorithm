package ±‚√ 100;

import java.util.Scanner;

public class Ex_1019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] time = sc.next().split("\\.");
		int a = Integer.parseInt(time[0]);
		int b = Integer.parseInt(time[1]);
		int c= Integer.parseInt(time[2]);
		System.out.printf("%04d.%02d.%02d",a,b,c);
	}
}
