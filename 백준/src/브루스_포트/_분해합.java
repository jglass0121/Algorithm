package 브루스_포트;

import java.util.Scanner;

public class _분해합 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int ans=0;
		for (int i = num; i>0; i--) {
			int sum =0;
			String strN =String.valueOf(i);
			for (int j = 0; j < strN.length(); j++) {
				sum+=strN.charAt(j)-'0';
			}
			if(i+sum==num) {
				ans = i;
			}
		}
		if(ans == 0) {
			System.out.println(0);
		}else {
			System.out.println(ans);
		}
	}
}
