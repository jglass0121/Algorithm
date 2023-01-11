package Ω∫≈√;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class _10773 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		Stack<Integer> q = new Stack<Integer>();
		
		for (int i = 0; i < num; i++) {
			int a =sc.nextInt();
			if(a == 0) {
				q.pop();
				continue;
			}
			q.add(a);
		
		}
		
		int add = 0;
		Iterator<Integer> iter = q.iterator(); 
		while(iter.hasNext()) {
			int b =  iter.next();
			add += b;
		}
		System.out.println(add);
				
		
		
		
	
	}
}
