package Á¤·Ä;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10989 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a =Integer.parseInt(br.readLine());
		int[] b = new int[a];
		for (int i = 0; i < a; i++) {
			 b[i]=  Integer.parseInt(br.readLine());
		}
		int i,k;
		int max;
		for (i = 0; i< b.length-1; i++) {
			max =i;
			for ( k= i+1; k < b.length; k++) {
				if(b[i]<b[k]) {
					max = k;
				}
			}
		}
	}
}
