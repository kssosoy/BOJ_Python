class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0]=-1;
        for(int i=1; i<s.length(); i++){
            String temp = s.substring(0,i);

            int count=0;
            for(int j=0; j<temp.length(); j++){
                if(s.charAt(i)==temp.charAt(j)){
                    count=i-j;
                }
            }
            if(count==0){
                answer[i]=-1;
            }
            else{
                answer[i]=count;
            }
            
        }
        return answer;
    }
}