package Chater2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class class2_4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("키의 최댓값을 구하세요.");
		System.out.print("사람 수 : ");
		int a = Integer.parseInt(br.readLine());
		Random rand = new Random();
		
		int[] height = new int[a];
		
		for (int i = 0; i < height.length; i++) {
			height[i] =100+rand.nextInt(90);
			System.out.println("height["+i+"] : "+height[i]);
		}
		
		
		System.out.println("최댓값은"+maxOf(height)+"입니다.");
		
		
	}

	private static int maxOf(int[] a) {
		int max =a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
				max =a[i];
		}
		
		return max;
	}
}
