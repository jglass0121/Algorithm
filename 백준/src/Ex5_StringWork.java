import java.util.Scanner;

public class Ex5_StringWork {
	public static void main(String[] args) {
		//키보드에서 받은 값이 회문수인지 판단
		Scanner sc =new Scanner(System.in);
		String str =sc.next();
//		int center =str.length()/2;
//		String a = str.substring(0,center);
//		String b = str.substring(center+1,str.length());
		String n = "";
		for(int i=str.length()-1;i>=0;i--) {
			n+=str.charAt(i);
			
		}
		if(str.equals(n)) {
			System.out.println(str+"은 회문수 입니다.");
		}else {
			System.out.println(str+"은 회문수가 아닙니다.");
		}
		

	}
}
