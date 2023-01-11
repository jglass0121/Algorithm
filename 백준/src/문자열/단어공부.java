package 문자열;
import java.util.Scanner;


public class 단어공부 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[26];
		String word = scan.next().toUpperCase();
		int max =-1;
		char st ='?';
		for (int i = 0; i < word.length(); i++) {
			arr[word.charAt(i)-65]++;
			System.out.println(arr[word.charAt(i)-65]);
			if(max<arr[word.charAt(i)-65]) {
				max =arr[word.charAt(i)-65];
				st =word.charAt(i);
			}else if(arr[word.charAt(i)-65]==max){
				st = '?';
			}
		}
		System.out.println(st);
	}
}
