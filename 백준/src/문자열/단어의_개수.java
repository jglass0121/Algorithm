package 문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 단어의_개수 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("문장을 입력해 주세요!");
		String s = scan.nextLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		
		System.out.println(st.countTokens());
		}
}