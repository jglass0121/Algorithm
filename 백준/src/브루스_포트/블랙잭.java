package 브루스_포트;

import java.util.Scanner;

public class 블랙잭 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] check = new int[3];
		int sum=0;
		int num = sc.nextInt();
		
//		맞춰야하는 수
		int M = sc.nextInt();
		int[] ar =new int[num];
		for (int i = 0; i < num; i++) {
			ar[i]=sc.nextInt();
		}
		
		int max =0;
		outer:for (int i = 0; i < ar.length-2; i++) {
			for (int j = i+1; j < ar.length-1; j++) {
				for (int j2 = j+1; j2 < ar.length; j2++) {
					sum = ar[i]+ar[j]+ar[j2];
		
					if(sum<=M) {
						max = Math.max(max, sum);
					}
					if(max==M) {
						break outer;
					}
				}
			}
		}
		System.out.println(max);
		
				
	}
}
