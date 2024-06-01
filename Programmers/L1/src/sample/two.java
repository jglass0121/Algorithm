package sample;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class two {

    public static void main(String[] args) {
        String[] record = {"P 300 6", "P 500 3", "S 100 4", "P 600 2", "S 1200 1"};
        solution(record);


    }

    private static int[] solution(String[] record) {

           int  fifo = FIFO(record);
           int lifo = LIFO(record);
           return new int[]{fifo,lifo};


    }

    private static int LIFO(String[] info) {
        Stack<int[]> pStack = new Stack<>();
        int totalCost = 0;

        for (String record : info){

        String[] split = record.split(" ");
        String type = split[0];
        int price = Integer.parseInt(split[1]);
        int cnt = Integer.parseInt(split[2]);

        if (type.equals("S")) {
            int saleCnt = cnt;
            System.out.println();
            while (saleCnt > 0 && !pStack.isEmpty()) {
                int[] purchase = pStack.peek();
                int purchasePrice = purchase[0];
                int purchaseCnt = purchase[1];

                if (purchaseCnt <= saleCnt) {
                    totalCost += purchaseCnt * purchasePrice;
                    saleCnt -= purchaseCnt;
                    pStack.pop();
                } else {
                    totalCost += saleCnt * purchasePrice;
                    purchase[1] -= saleCnt;
                    saleCnt = 0;
                }
            }

        } else {
            pStack.add(new int[]{price, cnt});
        }
        }

        return totalCost;

    }

    private static int FIFO(String[] info) {
        Queue<int[]> pQueue = new LinkedList<>();
        int totalCost = 0;

        for (String record : info) {

            String[] split = record.split(" ");
            String type = split[0];
            int price = Integer.parseInt(split[1]);
            int cnt = Integer.parseInt(split[2]);

            if (type.equals("S")) {
                int saleCnt = cnt;
                while (saleCnt > 0 && !pQueue.isEmpty()) {
                    int[] purchase = pQueue.peek();
                    int purchasePrice = purchase[0];
                    int purchaseCnt = purchase[1];

                    if (purchaseCnt <= saleCnt) {
                        totalCost += purchaseCnt * purchasePrice;
                        saleCnt -= purchaseCnt;
                        pQueue.poll();
                    } else {
                        totalCost += saleCnt * purchasePrice;
                        purchase[1] -= saleCnt;
                        saleCnt = 0;
                    }
                }

            } else {
                pQueue.add(new int[]{price, cnt});
            }
        }
        return totalCost;

    }
}
