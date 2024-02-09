import java.util.*;

class Score  {
    String name;
    int korea;
    int english;
    int math;

    public Score(String name, int korea, int english, int math) {
        this.name = name;
        this.korea = korea;
        this.english = english;
        this.math = math;
    }


}
public class _국영수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Score> list = new LinkedList<>();
        StringTokenizer st;

        sc.nextLine();
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(sc.nextLine());
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            list.add(new Score(name, kor, eng, math));
        }

        Collections.sort(list, new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                if(o1.korea-o2.korea ==0){
                    if (o1.english == o2.english) {
                        if (o1.math == o2.math) {
                            return o1.name.compareTo(o2.name);
                        }
                        return o2.math - o1.math;

                    }
                    return o1.english - o2.english;

                }
                return o2.korea-o1.korea;
        }});

        StringBuilder sb = new StringBuilder();
        for (Score student : list) {
            sb.append(student.name).append('\n');
        }

        System.out.println(sb);



    }
}
