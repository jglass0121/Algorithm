package ±‚√ 100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_1023 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a=br.readLine();
		String arr[] = a.split("\\.");
		System.out.printf("%s\n%s",arr[0],arr[1]);
		
	}
}
