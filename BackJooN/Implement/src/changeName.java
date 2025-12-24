public class changeName {
    public static void main(String[] args) {
        String str= "we_make_it";
        solution(str);
    }

    private static void solution(String str) {
        // index
        // _를 찾고 _가 없을떄까지 돌기


        while(str.indexOf("_") > 0){

            int index = str.indexOf("_");
            //replac ""
            str =  str.replaceFirst("_"," ");

            // 대문자로 변경
            int i = index + 1;
            char upperCase = Character.toUpperCase(str.charAt(i));
            str = str.replaceFirst("" + str.charAt(i), "" + upperCase);

        }

        System.out.println(str);

    }
}
