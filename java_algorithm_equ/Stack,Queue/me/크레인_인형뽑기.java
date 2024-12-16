package me;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

//stack
//
public class 크레인_인형뽑기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        int now = sc.nextInt();
        for (int i = 0; i < now; i++) {
            int nowNum = sc.nextInt()-1;
            for (int j = 0; j < arr.length; j++) {
                int currentValue = arr[j][nowNum];
                if (currentValue == 0) {
                    continue;
                }
                // stack과 비교후 같은 값이 - +2, 없
                if (!stack.isEmpty()) {// stack이 비어있지 않은 경우,
                    Integer peek = stack.peek();
                    if (peek == currentValue) { //
                        stack.pop();
                        arr[j][nowNum] = 0;
                        answer += 2;
                    } else { // 다른 값일 경우
                        stack.add(currentValue);
                    }
                } else { // stack이 빈 값인 경우,
                    stack.add(currentValue);
                }


                arr[j][nowNum] = 0;
                break;

            }
        }

        System.out.println(answer);


    }
}
