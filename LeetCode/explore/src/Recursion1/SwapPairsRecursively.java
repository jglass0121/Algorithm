class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SwapPairsRecursively {

    public ListNode swapPairs(ListNode head) {
        // 기저 조건: 노드가 없거나 노드가 하나인 경우
        if (head == null || head.next == null) {
            return head;
        }

        // 두 노드 교환
        ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        newHead.next = head;

        return newHead;
    }

    // 예제를 위한 테스트 코드
    public static void main(String[] args) {
        // 예제 리스트: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        SwapPairsRecursively swapPairs = new SwapPairsRecursively();
        ListNode result = swapPairs.swapPairs(head);

        // 결과 출력
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
