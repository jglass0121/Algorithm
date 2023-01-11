import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[26];
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = -1;
		}
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ar[ch - 'a'] == -1) {
				ar[ch - 'a'] = i;
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
