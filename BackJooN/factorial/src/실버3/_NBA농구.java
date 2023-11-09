package 실버3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _NBA농구 {
    public static void main(String[] args) throws IOException {
      // 변수 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t, ntime, time, t_a, t_b, s;
        boolean chk;
        s = time = t_a = t_b = 0;

        // 입력에서 테스트 케이스 수 (t)를 읽기
        t = Integer.parseInt(br.readLine());

        // 각 테스트 케이스 처리
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 값 (chk) 및 시간 문자열 (str)을 입력에서 읽기
            chk = st.nextToken().equals("1") ? true : false;
            String str = st.nextToken();

            // 시간 문자열에서 분으로 계산 (ntime)
            ntime = (str.charAt(0) - '0') * 600;
            ntime += (str.charAt(1) - '0') * 60;
            ntime += (str.charAt(3) - '0') * 10;
            ntime += str.charAt(4) - '0';

            // s의 값 및 시간 차이를 기반으로 t_a 및 t_b를 업데이트
            if (s > 0)
                t_a += ntime - time;
            if (s < 0)
                t_b += ntime - time;

            // 다음 반복을 위해 s 및 시간을 업데이트
            s += chk ? 1 : -1;
            time = ntime;
        }

        // 2880 분 (48 시간)까지 남은 시간에 대한 t_a 및 t_b 조정
        if (s > 0)
            t_a += 2880 - time;
        if (s < 0)
            t_b += 2880 - time;

        // 결과를 HH:MM 형식으로 출력
        System.out.printf("%02d:%02d\n%02d:%02d\n", t_a / 60, t_a % 60, t_b / 60, t_b % 60);


    }
}
