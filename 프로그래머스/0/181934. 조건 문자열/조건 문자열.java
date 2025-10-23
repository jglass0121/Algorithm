class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String newOne ="";
        if(eq.equals("!")){
            newOne = ineq;
        }else{
            newOne = ineq+eq ;
        }
                    System.out.println("ㅇ ;"+newOne);

        if(newOne.equals(">=")){
            return (n>=m) ? 1 :0;

        }else if(newOne.equals("<=" )){
            return (n<=m) ? 1 :0;
        }else if(newOne.equals(">")){
            return (n>m) ? 1 : 0;
        }else{
            return (n<m) ? 1 :0;
        }
        
        
        
    }
}