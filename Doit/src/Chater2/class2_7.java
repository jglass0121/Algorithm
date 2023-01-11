package Chater2;

import java.util.Scanner;

public class class2_7 {
	static void copy(int[] arr, int[] arr2) {
		int size= arr.length+1;
		System.out.println(arr.length+"개수");
		int total = arr.length+arr2.length;
		int[] arr1 = new int[total]; 
		arr1  = arr.clone();
		for (int i = 0; i < arr2.length; i++) {
			arr1[size]=arr2[i];
			size++;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
	}
	
	static void rcopy(int[] a, int[] b) {
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("배열 a의 요솟수 : ");
		int a= sc.nextInt();
		
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.print("a["+i+"] : ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int c= sc.nextInt();
		
		int[] arr2 = new int[c];
		for (int i = 0; i < c; i++) {
			System.out.print("b["+i+"] : ");
			arr2[i] =sc.nextInt();
		}
		
		
		System.out.println("배열 a와 b는"+ (equal(arr,arr2) ? "같습니다" : "같지 않습니다."));
		
		System.out.println("a == b");
		copy(arr,arr2);
		
		
		System.out.println("역순");
		
		
	}

	private static boolean equal(int[] arr, int[] arr2) {
		if(arr.length != arr2.length) {
			return false;
		}else {
			for (int i = 0; i < arr2.length; i++) {
				if(arr[i] != arr2[i]) {
					return false;
				}
			}
		}
		
		
		return true;
	}
}
