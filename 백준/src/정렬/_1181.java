package 정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _1181 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		String[] b = new String[a];
		for (int i = 0; i <a ; i++) {
				b[i] =s.next();
				
		}
		Arrays.sort(b,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length())
					return o1.compareTo(o2);
				else {
					return o1.length()-o2.length();
					
				}
			}
			
		});
		System.out.println(b[0]);
		for (int i = 1; i < a; i++) {
			//중복 제거
			if(!b[i].equals(b[i-1])) {
				System.out.println(b[i]);
			}
			
		}
		
	}
}
