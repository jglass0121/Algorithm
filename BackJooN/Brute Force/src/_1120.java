import java.util.Scanner;

public class _1120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();

        int minAdditions = Integer.MAX_VALUE;

        for (int i = 0; i <= B.length() - A.length(); i++) {
            int diffCount = 0;
            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(i + j)) {
                    diffCount++;
                }
            }
            minAdditions = Math.min(minAdditions, diffCount);
        }

        System.out.println(minAdditions);
        scanner.close();
    }
}
