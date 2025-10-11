import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> s = new ArrayDeque<>();
        for(int i=0; i<arr.length; i++){
            if(s.size()>0 && s.getLast()==arr[i]){
                continue;             
            }
            else{
                s.addLast(arr[i]);
            }
        }
        int len= s.size();
        int[] answer = new int [len];
        for(int i=0; i<len; i++){

            answer[i]=s.removeFirst();
        }
        
        
    

        return answer;
    }
}