class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i=0; i<prices.length; i++){
            int num= prices[i];
            int count=0;
            for(int j=i+1; j<prices.length; j++){
                if(num<=prices[j]){
                    count++;
                }
                else{
                    count++;
                    break;
                }
            }
            answer[i]=count;
            
        }

        return answer;
    }
}

//[1,4,2,3,3] => [4,1,2,1,0]
//[5,2,3,1,2] => [1,2,1,2,0]