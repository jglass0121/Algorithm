package test;

import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.HashMap;

public class _1 {
    public static void main(String[] args) {
        String[] friends ={"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts ={"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        System.out.println(solution(friends, gifts));


    }

    private static int solution(String[] friends, String[] gifts) {
        int[][] arr = new int[friends.length][friends.length];

        int[] giveGift = new int[friends.length];
        int[] getGift = new int[friends.length];
        int[] presentPercent = new int[friends.length];
        HashMap<String, Integer> changeMember = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            changeMember.put(friends[i], i);
        }

        for (int i = 0; i < gifts.length; i++) {
                String[] split = gifts[i].split(" ");
                Integer from = changeMember.get(split[0]);
                Integer to = changeMember.get(split[1]);
                giveGift[from] += 1;
                getGift[to] += 1;
            arr[from][to] += 1;
        }

        for (int i = 0; i < friends.length; i++) {
            presentPercent[i] = giveGift[i] - getGift[i];
        }
        int[] next = new int[friends.length];
        boolean visited[][] = new boolean[friends.length][friends.length];
        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (visited[i][j]) continue;
                if (i == j) continue;
                visited[j][i] = true;
                int onePresent = presentPercent[i];
                int twoPresent = presentPercent[j];
                if (onePresent == twoPresent) {
                    continue;
                }
                int i1 = arr[i][j];
                System.out.println("i1 = " + i1);
                int i2 = arr[j][i];
                System.out.println("i2 = " + i2);
                if (i1 != 0 || i2 != 0) {
                    System.out.println("안으로");
                    System.out.println("Arrays.toString(next) = " + Arrays.toString(next));
                    int from = arr[i][j]; //i -> f
                    int to = arr[j][i];
                    if (from > to) {
                        next[i]++;
                    } else if (from < to) {
                        next[j]++;
                    } else {
                        if (onePresent > twoPresent) {
                            next[j]++;
                        } else {
                            next[i]++;
                        }
                    }
                } else { //선물 기록x, 선물 지수 작은사람
                    if (onePresent > twoPresent) {
                        next[j]++;
                    } else if (twoPresent > onePresent) {
                        next[i]++;
                    }
//                    } else if (giveGift[i] == 0 && getGift[i] == 0 && giveGift[j] == 0 && getGift[j] == 0) {
//                        if (onePresent > twoPresent) {
//                            next[j]++;
//                        } else if (twoPresent > onePresent) {
//                            next[i]++;
//                        }



                }
            }
        }
        System.out.println("Arrays.toString(next) = " + Arrays.toString(next));
        int max = 0;
        for (int i = 0; i < next.length; i++) {
            max = Math.max(next[i], max);
        }
        return max;


    }

}

