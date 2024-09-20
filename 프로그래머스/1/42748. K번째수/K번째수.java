import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] arr = new int[commands.length];
        int cnt =0;
        for(int[] command : commands){
            int[] arr_co = array;
            System.out.println(Arrays.toString(arr_co));
            int i = command[0]-1;
            System.out.println("i : " + i);
            int j = command[1]-1;
            System.out.println("j : " +j);
            int k = command[2];
            System.out.println("k : " +k);
            
            
            int[] copyArr =  Arrays.copyOfRange(arr_co ,i,j+1);
            System.out.println("copyArr : "+Arrays.toString(copyArr));

            Arrays.sort(copyArr);
            
            arr[cnt] = copyArr[k-1];
            System.out.println(arr[cnt]);
            
            
            cnt++;
            
        }
        
        return arr;
    }
}