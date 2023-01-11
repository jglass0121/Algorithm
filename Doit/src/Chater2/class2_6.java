package Chater2;

import java.util.Scanner;

public class class2_6 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("요솟수");
		int a = sc.nextInt();
		int[] arr =new int[a];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("x["+i+"] :");
			arr[i] =sc.nextInt();
		}
		
		
		reverse(arr);
		
		System.out.println("요소의 역순으로 정렬합니다.");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		System.out.print("총 합계 : " +sumOf(arr));
		
		
		
		
	}

	private static void reverse(int[] arr) {
		for (int i = 0; i < arr.length/2; i++) {
			swap(arr,i,arr.length-i-1);
			
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i]= arr[j];
		arr[j] = t;
	}
}
