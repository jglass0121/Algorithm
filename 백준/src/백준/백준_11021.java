package 백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준_11021 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		for (int i = 1; i <= count; i++) {
				String str = br.readLine();
				sb.append("Case #").append(i).append(": ")
				.append(str.charAt(0)-'0'+str.charAt(2)-'0')
				.append("\n");
		}
		System.out.println(sb);
	}
}
