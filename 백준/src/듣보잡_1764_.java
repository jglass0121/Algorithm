import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class µË∫∏¿‚_1764_ {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String[] st = br.readLine().split(" ");
		int Listen =Integer.parseInt(st[0]);
		int Watch =Integer.parseInt(st[1]); 

		HashSet<String> lisen = new HashSet();
		ArrayList<String> r= new ArrayList<>();
		for (int i = 0; i < Listen; i++) {
			lisen.add(br.readLine());
			
		}
		for (int i = 0; i < Watch; i++) {
			String tmp = br.readLine();
			if(lisen.contains(tmp)) {
				r.add(tmp);
			}
		}
		

		Collections.sort(r);
		System.out.println(r.size());
		for(String s : r) {
			System.out.println(s);
		}
		
	}
}
