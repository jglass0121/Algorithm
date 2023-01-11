package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 복습 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String s =null;
		int a =0;
		for (int i = 0; i < num; i++) {
			a  = Integer.parseInt(br.readLine());
			s = br.readLine();
		}
		String result = null;
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = 0; j < a; j++) {
				result +=s.charAt(i);
				System.out.println(result);
			}
			
		}
			
		
		
		
		
	}
}
