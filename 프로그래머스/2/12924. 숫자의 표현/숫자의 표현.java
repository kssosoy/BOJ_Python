class Solution {
    public int solution(int n) {
        int[] array = new int[n];
        int answer = 0;
        for (int i=0; i<n; i++){
            array[i]=i+1;
        }
        
        int sum = 0;
        int start = 0;

        
        for (int j=0; j<array.length; j++){
            sum=0;
            for (int k=j; k<array.length; k++){
                sum+=array[k];
                if(sum==n){
                    answer+=1;
                    continue;
                }
                if(sum>n){
                    break;
                }
                
            }
        }
     
        return answer;
    }
}