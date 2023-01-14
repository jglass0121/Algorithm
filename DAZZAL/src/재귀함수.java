
public class 재귀함수 {
	 void re(int a) { //n : 5
		if (a==0) {
			System.out.println(a);
			return;
		}
		System.out.println(a+"하이원");
		re(a-1);
		System.out.println(a+"하이");
		
		
	}
	public static void main(String[] args) {
		재귀함수 b = new 재귀함수();
		b.re(5);
	}
}
