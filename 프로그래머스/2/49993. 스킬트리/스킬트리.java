class Solution {
    public int solution(String skill, String[] skillTrees) {
       int cnt = 0;

        for (String tree : skillTrees) {
            int idx = 0; // skill에서 현재 배워야 할 위치
            boolean isValid = true;

            for (int i = 0; i < tree.length(); i++) {
                char c = tree.charAt(i);

                // skill에 포함된 스킬인지 확인
                if (skill.indexOf(c) != -1) {

                    // 순서가 맞는지 체크
                    if (c != skill.charAt(idx)) {
                        isValid = false;
                        break;
                    }

                    idx++; // 다음 스킬로 이동
                }
            }

            if (isValid) cnt++;
        }

        return cnt;
    }
}