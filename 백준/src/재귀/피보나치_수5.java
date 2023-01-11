package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치_수5 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(re(num));
	}
	public static int re(int num) {
		if(num==0)return 0;
		if(num==1)return 1;
		System.out.println("re(num-1):"+re(num-1)+"re(num-02):"+re(num-02));
		return re(num-1)+re(num-2);
		
	}
}
