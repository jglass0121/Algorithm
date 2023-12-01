package L2;

import java.util.ArrayList;
import java.util.LinkedList;

public class 수식최대화 {
    public static void main(String[] args) {
        String expression = "100-200*300-500+20";
        solution(expression);

    }

    static char[] op = {'+', '-', '*'};
    static char[] priories = new char[3];
    static boolean visited[] = new boolean[3];
    static LinkedList<Character> expressionOp;
    static LinkedList<Long> expressionNums;

    private static void solution(String expression) {

        expressionOp = new LinkedList<>();
        expressionNums = new LinkedList<>();
        int idx = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '*' || expression.charAt(i) == '-') {
                expressionOp.add(expression.charAt(i));
                expressionNums.add(Long.parseLong(expression.substring(idx, i)));
                idx = i + 1;
            }
        }
        expressionNums.add(Long.parseLong(expression.substring(idx)));

        dfs(0);
        System.out.println( max);
    }

    static long max;

    private static void dfs(int depth) {
        if (depth == 3) {
            max = Math.max(Math.abs(calcExpression()), max);
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (visited[i]) {
                continue;
            }
            priories[depth] = op[i]; //+,-,* 우선순위 구하기
            visited[i] = true;
            dfs(depth + 1);
            visited[i] = false;
        }

    }

    private static long calcExpression() {
        ArrayList<Long> tmpExpressionNums = new ArrayList<>(expressionNums);
        ArrayList<Character> tmpExpressionOps = new ArrayList<>(expressionOp);
        while (tmpExpressionOps.size() > 0) {

            //수식의 최댓값 찾기
            int maxPriority = 0;
            for (int i = 0; i < tmpExpressionOps.size(); i++) {
                maxPriority = Math.max(getPriority(tmpExpressionOps.get(i)), maxPriority);
            }
            //수식 계산
            for (int i = 0; i < tmpExpressionOps.size(); i++) {
                if (getPriority(tmpExpressionOps.get(i)) == maxPriority) {
                    tmpExpressionNums.add(i, calc(tmpExpressionNums.remove(i), tmpExpressionNums.remove(i), tmpExpressionOps.remove(i)));
                }
            }
        }

        return tmpExpressionNums.get(0);
    }

    private static long calc(Long num1, Long num2, Character op) {
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

    private static int getPriority(Character op) {
        int priority;
        if (op == priories[0]) {
            priority = 2;
        } else if (op == priories[1]) {
            priority = 1;
        } else {
            priority = 0;
        }
        return priority;
    }
}
