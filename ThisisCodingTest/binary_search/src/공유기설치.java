import java.util.Arrays;
        import java.util.Scanner;

public class 공유기설치 {
    static int[] house ;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();
        house = new int[total];
        for (int i = 0; i < total; i++) {
            house[i] = sc.nextInt();
        }
        Arrays.sort(house);
        
        //계산 (거리 기준)
        int lo = 1;
        int hi = house[total - 1] - house[0] + 1;


        //upper
        while (lo < hi) {
            int mid = (hi + lo) / 2;
            /**
             * mid 거리에 대해 설치 가능한 공유기 개수가 M 개수에 못미치면
             * 거리를 좁혀야 하기 때문에 hi 를 줄인다.
             */
            if (find_binary(mid) < num) {
                hi = mid;
            } else {
                /**
                 * 설치 가능한 공유기 개수가 M 개수보다 크거나 같으면
                 * 거리를 벌리면서 최소거리가 가질 수 있는 최대 거리를
                 * 찾아낸다.
                 */
                lo = mid + 1;
            }

        }
        /**
         *  Upper Bound는 탐색 값을 초과하는 첫 번째 값을 가리키므로,
         *  1을 빼준 값이 조건식을 만족하는 최댓값이 된다.
         */
        System.out.println(hi-1);
    }

    private static int find_binary(int distance) {
        // 첫 번째 집은 무조건 설치한다고 가정
        int count = 1;
        int lastLocate = house[0];
        for (int i = 1; i < house.length; i++) {
            int locate = house[i];
            if (locate - lastLocate >= distance) {
                count++;
                lastLocate = locate;
            }
        }
        return count;
    }



}
