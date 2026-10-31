package 해시;

import java.util.*;

public class 베스트앨범1 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        solution(genres, plays);
    }

    private static int[] solution(String[] genres, int[] plays) {


        // 총합구하기
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            map.put(genre, map.getOrDefault(genre + play, play));
        }


        HashMap<String, LinkedList<int[]>> total = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            int[] arr = {i, play};

            total.computeIfAbsent(genre, k -> new LinkedList<>()).add(arr);
       }

        ArrayList<String> genreList = new ArrayList<>(map.keySet());
        System.out.println("genreList = " + genreList);
        genreList.sort((a, b) -> map.get(b) - map.get(a));

        ArrayList<Integer> answerList = new ArrayList<>();
        for (String genre : genreList) {
            LinkedList<int[]> song = total.get(genre);
            song.sort((a,b)->{
                if (a[1] == b[1]) {
                    return a[0] - b[0];
                }
                return b[1] - a[1];
            });

            // 가장 많이 재생된 노래 1개 추가
            answerList.add(song.get(0)[0]);
            // 장르에 속한 곡이 2개 이상일 경우 1개 더 추가
            if (song.size() > 1) {
                answerList.add(song.get(1)[0]);
            }

        }
        System.out.println("answerList = " + answerList);


        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
