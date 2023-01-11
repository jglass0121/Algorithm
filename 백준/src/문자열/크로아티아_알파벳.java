package 문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 크로아티아_알파벳 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String str[] = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String str1[] = {"č","ć","dž","đ","lj","nj","š","ž"};
		for (int i = 0; i < str.length; i++) {
			if (s.contains(str[i])) {
				s = s.replace(str[i], str1[i]);
			}
		}
		System.out.println(s);
		System.out.println(s.length());
	}

}
