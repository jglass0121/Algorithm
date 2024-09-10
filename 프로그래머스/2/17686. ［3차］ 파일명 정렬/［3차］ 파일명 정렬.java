
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    
    
     static class Files {
        String file_name;
        String head;
        int num;
        String tail;

        public Files(String file_name, String head, int num, String tail) {
            this.file_name = file_name;
            this.head = head;
            this.num = num;
            this.tail = tail;
        }
    }
    
    public String[] solution(String[] files) {

        ArrayList<Files> filesClass = new ArrayList<>();
        String str[] = new String[3];
        str[0] = ""; // head
        str[1] = ""; // num
        str[2] = ""; // tail
        for (int i = 0; i < files.length; i++) {
            String file = files[i];
            char[] charArray = file.toCharArray();

            str[0] = ""; // head
            str[1] = ""; // num
            str[2] = ""; // tail
            int idx = 0;
            boolean secondStr =false;
            for (int j = 0; j < charArray.length; j++) {
                if (Character.isDigit(charArray[j])) {
                    //number
                    str[1] +=  charArray[j] ;
                    idx = j;
                    secondStr = true;
                } else {
                    if (secondStr) {
                        str[2] += file.substring(idx, file.length());
                        break;
                    }
                    //head
                    str[0] += charArray[j];
                }
            }

            //tail
            filesClass.add(new Files(file,str[0], Integer.parseInt(str[1]), str[2]));
        }

        Collections.sort(filesClass, new Comparator<Files>() {
            @Override
            public int compare(Files o1, Files o2) {
                if ((o1.head.toLowerCase()).equals(o2.head.toLowerCase())) {
                    return o1.num - o2.num;
                } else {
                    return (o1.head.toLowerCase()).compareTo(o2.head.toLowerCase());
                }
            }
        });


        String[] answer = new String[filesClass.size()];
        for (int i = 0; i < filesClass.size(); i++) {
            answer[i] = filesClass.get(i).file_name;
        }

        return answer;

    }
}