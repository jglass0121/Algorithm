package 브루스_포트;

import java.util.Scanner;

public class 분해합 {
	 ;public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String num = sc.next();
		int n = Integer.parseInt(num);
		String a = "";
		for (int i = 0; i < num.length(); i++) {
			a = " "+ i;
			for (int j = 0; j <a.length() ; j++) {
				a+= ""+a.charAt(j)+",";
			}
		}
		
		//2,3,4
		int[] arr = new int[a.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(a.split(",")[i]);
		}
	}
	
}
