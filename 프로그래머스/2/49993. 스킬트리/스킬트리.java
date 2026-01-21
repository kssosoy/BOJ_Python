import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String tree: skill_trees){
            Queue<Character> q = new LinkedList<>();
        for(char c : skill.toCharArray()){
            q.add(c);
        }
            boolean isValid =true;
            for(char c : tree.toCharArray()){
                if(skill.indexOf(c)!=-1){
                    if(q.peek()!=c){
                       isValid=false;
                        break;
                    }
                    else{
                        q.poll();
                    }
                }
            }
            if(isValid){
                answer++;
            }
        }
        return answer;
    }
}