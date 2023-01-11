package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_10871 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st =new StringTokenizer(br.readLine()," ");
		int count = Integer.parseInt(st.nextToken());
		int limit= Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int value = Integer.parseInt(st.nextToken());
			
			if(value<limit) {
				sb.append(value).append(' ');
			}
		}
		System.out.println(sb);
	}
}
