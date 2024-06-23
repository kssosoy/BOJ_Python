class Solution {
    public int solution(int n) {
        String binary = Integer.toBinaryString(n);
       
        int count=0;
         for (char ch : binary.toCharArray()) {
            if (ch == '1') {
                count++;
            }
        }
        
        int answer = n+1;
        while(true){
            int count1=0;
            String binary1 = Integer.toBinaryString(answer);
           
            for (char ch : binary1.toCharArray()) {
                if (ch == '1') {
                    count1++;
                }
            }
            if (count==count1){
                break;
            }
            answer++;
        } return answer;
            
        }
       
    
}