package String.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _25206 {
    public static void main(String[] args) throws IOException {
        String[][] grade = new String[20][3];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sumGrade = 0;
        double sumScore = 0;

        for(int i = 0 ; i < 20 ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            grade[i][0] = st.nextToken();
            grade[i][1] = st.nextToken();
            grade[i][2] = st.nextToken();

            if(!grade[i][2].equals("P")) {
                sumScore += getTotal(Double.parseDouble(grade[i][1]), grade[i][2]);
                sumGrade += Double.parseDouble(grade[i][1]);
            }
        }

        if(sumScore != 0) {
            sumScore /= sumGrade;
        }

        System.out.printf("%f", sumScore);
    }


    private static Double getTotal(double score,String grade) {

        double total =0;

        switch (grade) {
            case "A+":
                total =score * 4.5;
                break;
            case "A0":
                total =score * 4.0;
                break;
            case "B+":
                total =score * 3.5;
                break;
            case "B0":
                total =score * 3.0;
                break;
            case "C+":
                total =score * 2.5;
                break;
            case "C0":
                total =score * 2.0;
                break;
            case "D+":
                total =score * 1.5;
                break;
            case "D0":
                total =score * 1.0;
                break;
            case "F":
                total =score * 0.0;
                break;
        }
        return total;
    }
}
