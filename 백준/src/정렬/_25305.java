package Á¤·Ä;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _25305 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Integer[] arr= new Integer[a];  
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		
		
		System.out.println(arr[b-1]);
		
	}
}
