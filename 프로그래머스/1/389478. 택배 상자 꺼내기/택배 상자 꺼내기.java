class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int row=(num-1)/w;
        int tempCol= (num-1)%w;
        int col=0;
        if(row%2==0){
            col=tempCol;
        }
        else{
            col=(w-1)-tempCol;
        }
        int h =(n-1)/w;
        for(int i=row; i<=h; i++){
            int currentBoxIdx;
            
            if(i%2==0){
                currentBoxIdx = i*w+col;
            }
            else{
                currentBoxIdx = i*w+(w-1-col);
            }
            
            if(currentBoxIdx<n){
                answer++;
            }
        }
    
        
        return answer;
    }
}