package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class _10815_2 {
	
	static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < m; i++) {
			int result = BinarySearch(Integer.parseInt(st.nextToken()));
			
			if(result != -1) {
				System.out.println(1+" ");
			}else {
				System.out.println(0+" ");
			}
			
		}
		
		
		
		
	}
	private static int BinarySearch(int target) {
		int left =0;
		int right = arr.length-1;
		int mid;
		
		while(left <=right) {
			mid =(left+right)/2;
			
			//타겟이 중간값보다 클때
			if(arr[mid]<target) {
				left = mid+1;
			}else if(arr[mid]>target) {
				//타겟이 중간값보다 작을 때
				right = mid-1;
			}else {
				//target == arr[mid]
				return mid;
			}
			
			
		}
		//찾지 못하고 while문을 나오게 된다면ㄴ
			return -1;
		
	}
}
