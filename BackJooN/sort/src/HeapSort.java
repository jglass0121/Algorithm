public class HeapSort {
    static int number = 9;
    static int[] heap = {5, 3, 3, 4, 5, 2, 5, 1, 4, 3};
    

    public static void main(String[] args) {
        //먼저 전체 트리 구조를 최대 힙구조로 바꾼다
        for (int i = 1; i < number; i++) {
            int c = i;
            do {

                int root = (c - 1) / 2;
                if (heap[root] < heap[c]) { //부모의 값보다 자식이 클 경우
                    int tmp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = tmp;
                }
                c = root; //자식이 부모로 이동하여 반복적으로 수행
            } while (c != 0);
        }
        //크기를 줄여 반복적 힙 구성
        for (int i = number - 1; i >= 0; i--) {
            int temp = heap[0]; //가장 큰 값
            heap[0] = heap[i]; //가장 큰값을 맨뒤로 바꿔 줌으로써 오름차순 완성ㄴ
            heap[i] = temp;

            int root = 0;
            int c = 1;
            do {
                c = 2 * root + 1; // 루트의 자식
                //자식 중 더 큰 값을 찾기
                if (heap[c] < heap[c + 1] && c < i - 1) { //범위를 벗어나는 것을 맛아줌
                    c++;
                }
                //루트보다 자식이 더 크다면 교환
                if (heap[c] > heap[root] && c < i) {
                    int tem = heap[root];
                    heap[root] = heap[c];
                    heap[c] = tem;
                }

                root = c; //자식이 부모가 되어 ㄴ반복하기 위함

            } while (c < i);

        }

        for (int i = 0; i < number; i++) {
            System.out.println("heap = " + heap[i]);
        }
    }


}
