package 실버2;

import java.util.Scanner;

public class 색종이_만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        sc.nextLine();
        for (int i = 0; i < arr.length; i++) {
            String[] str = sc.nextLine().split(" ");
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }
        int[] solution = solution(arr);
        System.out.println(solution[0]);
        System.out.println(solution[1]);

    }

    static int[] answer;
    private static int[] solution(int[][] arr) {
        answer = new int[2];
        fac(arr,0,0,arr.length);
        return answer;

    }

    private static void fac(int[][] arr, int x, int y, int size) {
        if(isSame(arr,x,y,size,arr[x][y])){
            answer[arr[x][y]]++;
            return;
        }


        fac(arr,x,y,size/2);
        fac(arr,x+size/2,y,size/2);
        fac(arr,x,y+size/2,size/2);
        fac(arr,x+size/2,y+size/2,size/2);


    }

    private static boolean isSame(int[][] arr, int x, int y, int size, int val) {

        for (int i = x; i < x+size; i++) {
            for (int j = y; j < y+size; j++) {
                if(arr[i][j] != val){
                    return false;
                }
            }

        }
        return true;
    }
}
