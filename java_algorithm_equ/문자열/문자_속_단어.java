import java.util.Scanner;

class 문자_속_단어 {

    public static String solution(String str) {
        String answer = "";
        // min이라는 변수와 pos라는 변수를 동시에 선언한 것이고
        // 그 중 min이라는 변수에는 상수값을 할당해 놓은 것.
        int min = Integer.MIN_VALUE, pos;
        // 전달 받은 String에서 공백의 인덱스를 가져온다.
        // indexOf는 찾는 문자열이 없다면 -1을 리턴하므로 가져온 공백의 인덱스가 -1이 아니면
        // 문자열에 공백이 있는 것을 의미한다.
        // 그 다음 처음 부터 공백의 인덱스까지 문자열을 잘라서 해당 문자열의 길이를 할당해 놓는다.
        // 그 다음 str을 기존의 공백 다음 부터 다시 잘라 다시 반복문으로 들어가서 같은 과정을 반복한다.
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > min) {
                min = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }

        return answer;

    }

    ;

    public static void main(String[] args) {


        // 스캐너 객체를 생성한다.
        Scanner input = new Scanner(System.in);
        // 문자열을 입력 받는다.
        String str = input.nextLine();
        // solution 메서드에 전달한다.
        System.out.println(solution(str));
    }
}