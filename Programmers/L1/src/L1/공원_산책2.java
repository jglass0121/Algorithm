package L1;

import java.util.Arrays;

public class 공원_산책2 {
    public static void main(String[] args) {
        String[] park = {"SOO","OXX","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        System.out.println(Arrays.toString(solution(park, routes)));
    }

    private static int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        int startH = 0;
        int startW = 0;

        for (int i = 0; i < h; i++) { //시작위치 정의
            if (park[i].contains("S")) {
                startH = i;
                startW = park[i].indexOf("S");
            }
        }


        for(String route : routes){
            String d = route.split(" ")[0];
            int move = Integer.parseInt(route.split(" ")[1]);

            int moveH = startH;
            int moveW = startW;

            for(int i=0; i<move; i++)
            {
                switch(d) {
                    case "S" : moveH++; break;
                    case "N" : moveH--; break;
                    case "E" : moveW++; break;
                    case "W" : moveW--; break;
                }

                if(moveH>=0&& moveH<h&&moveW>=0&&moveW<w){
                    System.out.println("park["+moveH+"].substring("+moveW+","+moveW+1+") = " + park[moveH].substring(moveW, moveW + 1));

                    if(park[moveH].substring(moveW,moveW+1).equals("X")){
                        break;
                    }
                    if(i==move-1){
                        startH=moveH;
                        startW=moveW;
                    }
                }
            }

        }



        int[] answer = {startH, startW};
        return answer;
    }
}
