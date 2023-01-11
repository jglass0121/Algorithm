
public class �ִ밪 {
	static int max(int[] a) {
		int n = a.length;
		int max_v= a[0];
		for (int i = 0; i < a.length; i++) {
			if(max_v<a[i]) {
				max_v = a[i];
			}
		}
		return max_v;
	}
	
	public static void main(String[] args) {
		int[] v  = {12,23,4,12,5};
		System.out.println(max(v));
		}
}
