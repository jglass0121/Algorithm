class Solution {
    public String solution(String my_string) {
        String eng = "aeiou";
        String ans ="";
        for(int i=0; i<my_string.length(); i++){
            if(eng.contains(""+my_string.charAt(i))){
                continue;
            }
            ans += ""+my_string.charAt(i);
            
        }
        
        return ans;
    }
}