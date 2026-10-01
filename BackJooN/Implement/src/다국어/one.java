package 다국어;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Time{
    public  int time;
    public char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }
}
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sT = sc.nextInt();
            int eT = sc.nextInt();
            arr.add(new Time(sT,'s'));
            arr.add(new Time(eT,'e'));
        }
        System.out.println(solution(arr));
    }

    private static int solution(ArrayList<Time> arr) {
        int answer= Integer.MIN_VALUE;
        arr.sort((a,b)->{
            if(a.time == b.time){
                return  b.state-a.state;
            }
            return a.time - b.time;
        });





        int cnt =0;
        for (Time ob : arr){
            System.out.println("ob = " + ob.time +" state : "+ob.state);
            if(ob.state =='s'){
                cnt++;
            }else{
                cnt--;
            }
            answer=Math.max(answer,cnt);
        }

        return answer;
    }
}
