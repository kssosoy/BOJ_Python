import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        //int[] answer = {};
        int len = answers.length;
        int[] counts = {0,0,0};
        
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i=0; i<len; i++){
            if(answers[i]==person1[i%5]){
                counts[0]=counts[0]+1;
            }
            if(answers[i]==person2[i%8]){
                counts[1]=counts[1]+1;
            }
            if(answers[i]==person3[i%10]){
                counts[2]+=1;
            }
        }
        int maxScore = Math.max(counts[0], Math.max(counts[1],counts[2]));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<3; i++){
            if(maxScore==counts[i]){
                list.add(i+1);
            }
        }
        int answerLen = list.size();
        int[] answer = new int[answerLen];
        for(int i=0; i<answerLen; i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}