package 해시;

import java.util.*;
import java.util.stream.Collectors;

public class 베스트앨범 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        solution(genres, plays);
    }

    static  class Genre{
        int idx;
        String genre;
        int play;

        public Genre(int idx, String genre, int play) {
            this.idx = idx;
            this.genre = genre;
            this.play = play;
        }
    }

    private static int[] solution(String[] genres, int[] plays) {
        // 총합 구하기
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }

        // map을 리스트에 넣어 계산을 한다
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        LinkedList<Genre> list = new LinkedList<>();
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            list.add(new Genre(i, genre, play));
        }

        // play별로 정렬
        List<Genre> collect = list.stream().sorted((a, b) ->  b.play-a.play).collect(Collectors.toList());


        LinkedList<Integer> res =

                new LinkedList<>();
        for (Map.Entry<String, Integer> entry : entries) {
            String genre = entry.getKey();
            int idx = 0;
            for (Genre prGenre : collect) {
                if (genre.equals(prGenre.genre)) {
                    idx++;
                    if (idx <= 2) {
                        res.add(prGenre.idx);
                    }
                    continue;
                }
            }
        }


        int[] array = res.stream().mapToInt(i -> i.intValue()).toArray();
        return array;
    }
}
