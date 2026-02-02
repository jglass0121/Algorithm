package me;

import java.util.Scanner;
import java.util.Stack;

public class 크레인_인형뽑기3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int num2 = sc.nextInt();
        int[] moves = new int[num2];
        for (int i = 0; i < num2; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(solution(arr, moves));

    }

    private static int solution(int[][] arr, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for (int move : moves) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i][move-1] == 0 ){
                    continue;
                }
                int currentValue = arr[i][move-1];

                arr[i][move-1] = 0;

                if(!stack.isEmpty()){
                    if(stack.peek() == currentValue){
                        stack.pop();
                        cnt+=2;
                    }else{
                        stack.add(currentValue);
                    }
                }else{
                    stack.add(currentValue);
                }
                break;

            }
        }

        return cnt;
    }
}
