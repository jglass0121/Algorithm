package _6장;

import java.util.ArrayList;
import java.util.List;


class Solution {

    private long max;
    private List<Long> expressionNums;
    private List<Character> expressionOps;
    private char[] ops;
    private char[] priorities;

    private boolean[] visited;

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("100-200*300-500+20"));
    }

    public long solution(String expression) {
        init(expression);
        dfs(0);
        return max;
    }

    private void init(String expression) {
        max = 0;
        expressionNums = new ArrayList<>();
        expressionOps = new ArrayList<>();
        ops = new char[]{'+', '-', '*'};
        priorities = new char[3];
        visited = new boolean[3];
        int idx = 0;
        for (int i = 0; i < expression.length(); i++) { // +,-* 와 숫자 각각 분류 리스트
            char ch = expression.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*') {
                expressionOps.add(ch);
                expressionNums.add(Long.parseLong(expression.substring(idx, i)));
                idx = i + 1;
            }
        }
        expressionNums.add(Long.parseLong(expression.substring(idx))); //마지막 숫자
    }

    private void dfs(int depth) { // +, - * 우선수위 구하여 계산
        if (depth == 3) { // 우선순위를 결정한 상태
            max = Math.max(Math.abs(calcExpression()), max);
            System.out.println("max = " + max);
            return;
        }

        for (int i = 0; i < ops.length; i++) {
            if (visited[i]) {
                continue;
            }

            priorities[depth] = ops[i];
            System.out.println("[depth] = " + priorities[depth]);
            visited[i] = true;
            dfs(depth + 1);
            System.out.println("priorities[depth] = " + priorities[depth]);
            visited[i] = false;
        }
    }

    private long calcExpression() {
        List<Long> tmpExpressionNums = new ArrayList<>(expressionNums);
        List<Character> tmpExpressionOps = new ArrayList<>(expressionOps);
        while (tmpExpressionOps.size() > 0) {
            int maxPriority = 0; // 가장 큰 우선순위를 구함
            for (int i = 0; i < tmpExpressionOps.size(); i++) { // 우선순위 숫자 표기
                maxPriority = Math.max(getPriority(tmpExpressionOps.get(i)), maxPriority);
            }
            for (int i = 0; i < tmpExpressionOps.size(); i++) { // 
                if (getPriority(tmpExpressionOps.get(i)) == maxPriority) { //해당 값이 가장 큰 우선순위 일 경우
                    tmpExpressionNums.add(i,
                            calc(tmpExpressionNums.remove(i), tmpExpressionNums.remove(i),
                                    tmpExpressionOps.remove(i))); // 계산
                    break;
                }
            }
        }
        return tmpExpressionNums.get(0);///최종 계산된 결과만 남음
    }

    private long calc(long num1, long num2, char op) {
        long ret;
        if (op == '+') {
            ret = num1 + num2;
        } else if (op == '-') {
            ret = num1 - num2;
        } else {
            ret = num1 * num2;
        }
        return ret;
    }

    private int getPriority(char op) {
        int priority;
        if (op == priorities[0]) {
            priority = 2;
        } else if (op == priorities[1]) {
            priority = 1;
        } else {
            priority = 0;
        }
        return priority;
    }
}
