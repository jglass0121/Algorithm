class Solution {
    public String solution(String s, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    char a = (char)(((c + n) - 'A') % 26 + 'A');
                    sb.append(a);
                }else{
                    char a = (char)(((c+n) -'a') % 26 +'a');
                    sb.append(a);
                }
                
                
            }else{
                sb.append(c);
            }
            
            
            
        }
        return sb.toString();
    }
}