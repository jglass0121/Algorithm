package ÁýÇÕ_¸Ê;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _11478 {
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		
		String a = sc.next();
		
		HashSet<String> set = new HashSet<String>();
		String name ="";
		
		for (int i = 0; i < a.length(); i++) {
			name = "";
			
			for (int j = i; j <  a.length(); j++) {
				name += a.substring(j,j+1);
				System.out.println(name);
				set.add(name);
			}
			
		}
		
		System.out.println(set);
		
		
	}
}
