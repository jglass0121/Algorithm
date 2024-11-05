package th;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 큰_수_출력하기 {
    public List<Integer> solution(Integer[] array) {
        List<Integer> answer = new ArrayList<>();
        answer.add(array[0]);
        for (int i=1; i < array.length; i++) {
            if (array[i-1] < array[i]) {
                answer.add(array[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        큰_수_출력하기 T = new 큰_수_출력하기();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Integer[] array = new Integer[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        for (int x : T.solution(array)) {
            System.out.print(x+" ");
        }
    }
}