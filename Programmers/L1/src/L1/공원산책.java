package L1;

public class 공원산책 {
    public static void main(String[] args) {
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2", "S 2", "W 1"};
        solution(park, routes);
    }

    private static void solution(String[] park, String[] routes) {

        int startX = 0;
        int startY = 0;
        int len = park[0].length()-1;
        for (int i = 0; i < park.length; i++) {
            String s = park[i];
            if (s.contains("S")) {
                startX = i;
                startY = s.indexOf("S");

            }

        }


        for (String route: routes){
            String[] split = route.split(" ");
            String dir = split[0];
            int go = Integer.parseInt(split[1]);
            switch (dir) {
                case "N":
                    goNandS(startX,startY,dir,go,len);
                    break;
                case "S":
                    goNandS(startX,startY,dir,go,len);
                    break;
                case "W":
                    goWandE(startX,startY,dir,go,len);
                    break;
                case "E":
                    goWandE(startX,startY,dir,go,len);
                    break;

            }

        }
    }

    private static void goWandE(int startX, int startY, String dir, int go, int len) {
        if (dir.equals("W")) {

        } else {

        }
    }

    private static void goNandS(int startX, int startY, String dir, int go, int len) {
        int nX = startX;
        int nY = startY;
        if (dir.equals("N")) {

            for (int i = 0; i < go; i++) {
                if (startX < 0 || startY < 0) {

                }
            }


        } else {

        }
    }
}
