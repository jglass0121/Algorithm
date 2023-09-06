import java.util.*;

public class 무지의_먹방_라이브 {
    static class Food {
        int time;
        int idx;

        public Food(int time, int idx) {
            this.time = time;
            this.idx = idx;
        }
    }
    public static void main(String[] args) {

        int[] food_times = {3, 1, 2};
        int k = 5;
        System.out.println(solution(food_times, k));
        ;

    }


    private static int solution(int[] foodTimes, int k) {
        List<Food> foods = new ArrayList<>();
        int n = foodTimes.length;
        for (int i = 0; i < n; i++) {
            foods.add(new Food(foodTimes[i], i + 1)); //시간과 순서(1부터)
        }

        foods.sort(new Comparator<Food>() {
            @Override
            public int compare(Food o1, Food o2) {
                return o1.time - o2.time;
            }
        }); //시간대로 오름차름

        int preTime = 0;
        int i = 0;
        for (Food f :
                foods) {
            long diff = f.time - preTime;

            //diff =0이면 차이가 없어서 skip
            if (diff != 0) {
                long spend = diff * n;
                if (spend <= k) {
                    k -= spend;
                    preTime = f.time;
                } else {
                    k %= n;
                    foods.subList(i, foodTimes.length).sort((o1,o2)->{
                        return o1.idx - o1.idx;
                    }); //원래 순서로 다시 재배치
                    //현 위치에서 나머지 만큼이동
                    return foods.get( i+(int)k).idx;


                }
            }
            ++i; //  시간 늘리가
            --n; // 남은 음식 줄이기
        }


        return -1;
    }
}
