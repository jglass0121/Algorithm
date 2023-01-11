package 정렬;

import java.util.Iterator;

public class 선택정렬 {
	public static void main(String[] args) {
		int ar[] = {6,2,3,4,1};
		int min,tmp;
		for (int i = 0; i < ar.length-1; i++) {
			min =i;
		
			for (int j = i+1; j < ar.length; j++) {
				if(ar[min]>ar[j]) {
					tmp=ar[min];
					ar[min]=ar[j];
					ar[j]=tmp;
				}
			}
			for (int j = 0; j < ar.length; j++) {
				System.out.print(ar[j]+",");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+",");
		}
	}
}
