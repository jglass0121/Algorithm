package 해쉬;

import java.lang.reflect.Array;
import java.util.*;

public class 베스트앨범 {

    static class Movie {
        int idx;
        int play;

        public Movie(int idx, int play) {
            this.idx = idx;
            this.play = play;
        }
    }
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] solution = solution(genres, plays);
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
        
    }

    private static int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> num  = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            num.put(genres[i], num.getOrDefault(genres[i], 0) + plays[i]);
        }
        ArrayList<String> manyToList = new ArrayList<>(num.keySet());

        manyToList.sort((o1,o2)->num.get(o2)-num.get(o1));

        for (String key : manyToList) {

            ArrayList<Movie> movies = new ArrayList<>();
            for (int i = 0; i < genres.length; i++) {

                if (key.equals(genres[i])) {
                    movies.add(new Movie(i, plays[i]));
                }
            }

            //정렬
            movies.sort(new Comparator<Movie>() {
                @Override
                public int compare(Movie o1, Movie o2) {
                    if(o1.play == o2.play){
                        return o1.idx - o2.idx; // idx 오름차순
                    }
                    return o2.play - o1.play; // 내림차순
                }
            });

            // 두개만 Insert 
            answer.add(movies.get(0).idx); // size가 1개일 경우
            if (movies.size() != 1) { // 2개일 경우 
                answer.add(movies.get(1).idx);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();


    }
}
