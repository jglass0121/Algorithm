package ±‚√ 100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1027 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] a= br.readLine().split("\\.");
		System.out.printf("%s-%s-%s",a[2],a[1],a[0]);
	}
}
