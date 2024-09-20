class Solution {
    public int solution(String s) {
        

        String[] splits = s.split("");
        String first  = splits[0];
        System.out.println(first);

        int f_cnt = 1; int diff= 0; int res  = 0;
        for(int i = 1; i<splits.length;i++){
            
            System.out.println(splits[i]);
            if(f_cnt ==0) {
                first = splits[i];
            }
            
            if(first.equals(splits[i] )){
                f_cnt++;
                System.out.println("f_cnt : "+ f_cnt);
            } else{
                diff++;
                System.out.println("splits[i] : "+ splits[i]);
                System.out.println("diff : "+ diff);
                if(f_cnt == diff) {
                    
                    f_cnt = 0;
                    diff = 0;
                    res ++;
                    System.out.println("res : "+ res);

                }
            }
        
        }
        if(f_cnt !=0 )res ++;
        return res;
    }
}