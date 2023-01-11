package 문자열;

import java.util.Scanner;

public class 괄호 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("몇번 반복할 것인가요?");
		int num = sc.nextInt();
		String s="";
		for (int i = 0; i <num; i++) {
			System.out.println("괄호를 입력하세요");
			s +=sc.next();
		}
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)=='(') {
					count++;
				}
				else if(s.charAt(i)==')'){
					count--;
					if(count<0) {
						count+=100;
					}
				}
			}
			if(count==0) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

