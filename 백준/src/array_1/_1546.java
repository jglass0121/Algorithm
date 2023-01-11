package array_1;

import java.util.Arrays;
import java.util.Scanner;

public class _1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubm
		Scanner scan = new Scanner(System.in);
		System.out.println("과목 수를 입력하세요");
		int num = scan.nextInt();
		double [] st = new double[num];
		double max =0.0;
		double sum=0.0;
		double avg =0.0;
		for (int i = 0; i < num; i++) {
			st[i] = scan.nextDouble();
			if(st[i]>max) {
				max =st[i];
			}
		}
		System.out.println("최댓값: "+max);
		for(int i=0;i<num;i++) {
			st[i]=((double)st[i]/max*100);
			sum+=st[i];
		}
		System.out.println(sum/num);
	
	}

}
