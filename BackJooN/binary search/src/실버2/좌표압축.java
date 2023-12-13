package 실버2;

import java.util.*;
import java.util.stream.Collectors;

public class 좌표압축 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr1 = new int[num];
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            arr1[i] = sc.nextInt();
            a.add(arr1[i]);
        }


        List<Integer> list= a.stream().distinct().collect(Collectors.toList()); //중복제거
        Collections.sort(list);

        for (int i = 0; i < arr1.length; i++) {
            int target = arr1[i];
            int i1 = Collections.binarySearch(list, target);
            arr1[i] = i1;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }




    }
}
