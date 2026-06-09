package 구현;

import java.security.spec.RSAOtherPrimeInfo;

public class 스킬트리 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill, skill_trees));
    }

    private static int solution(String skill, String[] skillTrees) {
        int cnt = 0;

        for (String tree : skillTrees) {
            int idx = 0;
            boolean isValid = true;

            for (char c : tree.toCharArray()) {
                if (skill.contains(String.valueOf(c))) {
                    if (c != skill.charAt(idx)) {
                        isValid = false;
                        break;
                    }
                    idx++;
                }
            }

            if (isValid) cnt++;
        }

        return cnt;
    }

}
