class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] temp= new int[number];
        for(int j=1; j<=number; j++){
            int count=0;
        for (int i=1; i*i<=j; i++){
            if(i*i==j){
                count++;
            }
            else if (j%i==0){
                count+=2;
            }
        }
            temp[j-1]=count;
        }
        
        for(int i=0; i<number; i++){
            if(temp[i]>limit){
                answer+=power;
            }
            else{
                answer+=temp[i];
            }
        }
        return answer;
    }
}

