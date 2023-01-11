package Àç±ÍÇÔ¼ö;

public class Àç±Í {
	static int re(int n) {
		if(n<=1) {
			return n;
		}
		return re(n-2) + re(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(re(4));
	}
}
