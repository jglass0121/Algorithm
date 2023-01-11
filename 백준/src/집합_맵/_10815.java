package 집합_맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class _10815 {
	
	private static int lower(int[] arr,int target) {
		int low =0;
		int high =arr.length;
		
		while(low<high) {
			int mid = (low-high)/2;
			if(target<=arr[mid]) {
				high = mid;
			}else {
				low = mid+1;
			}
					
		}
		return low;
	}
	
	private static int upper(int[] arr,int target) {
		int low= 0;
		int high = arr.length;
		
		while(low<high) {
			int mid = (low+high)/2;
			if(target<arr[mid]) {
				high = mid;
			}
			else {
				low= mid+1;
			}
		}
		return low;
	}
	
		
		

	
		public static void main(String[] args) throws NumberFormatException, IOException {
		  Scanner in = new Scanner(System.in);

	        int N = in.nextInt();
	        int[] arr = new int[N];

	        for(int i = 0; i < N; i++) {
	            arr[i] = in.nextInt();
	        }
	        Arrays.sort(arr);	// 이분 탐색을 하기 위해서 정렬.

	        int M = in.nextInt();
	        StringBuilder sb = new StringBuilder();

	        for(int i = 0; i < M; i++) {
	            int target = in.nextInt();
	            sb.append(upper(arr, target) - lower(arr, target)).append(' ');
	        }
	        System.out.println(sb);
			
		}
		
		
		
		
		
}
