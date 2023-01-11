package 집합_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		st= new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		

		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			//upper과 lower의 값의 차이를 구함다.
			sb.append(upper(arr,key)-lower(arr,key)).append(' ');
		}
		
		
		
	
		
		
				
	}
	private static int lower(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		
		while(lo<hi) {
			int mid = (lo+hi)/2;
			
			//key값이 중간 위치 값보다 작거나 같은 경우
			if(key <=arr[mid]) {
				hi = mid;
			}else {
				lo = mid+1;
			}
			
					
		}
		
		return lo;
	}
	private static int upper(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		// lo가 hi랑 같아질 때 까지 반복
		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // 중간위치를 구한다.
 
			// key값이 중간 위치의 값보다 작을 경우
			if (key < arr[mid]) {
				hi = mid;
			}
			// 중복원소의 경우 else에서 처리된다.
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;// TODO Auto-generated method stub
	}
	
}
