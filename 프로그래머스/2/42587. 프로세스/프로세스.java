import java.util.*;
class Solution {
    class Pair{
        int number;
        char character;
        
        public Pair(int number, char character){
            this.number = number;
            this.character = character;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        char loc = (char)('A'+location);
        ArrayList<Character> temp = new ArrayList<>();
        Deque<Pair> dq = new ArrayDeque<>();
        for(int i=0; i<priorities.length; i++){
            dq.offerLast(new Pair(priorities[i],(char)('A'+i)));
        }
        while(!dq.isEmpty()){
            Pair current = dq.pollFirst();
            int target = current.number;
            char ch = current.character;
            boolean check = false;
            for(Pair n : dq){
                if(target<n.number){
                    dq.offerLast(new Pair(target, ch));
                    check=true;
                    break;
                }
            }
            if(check==false){
                temp.add(ch);
            }
        }
        answer= temp.indexOf(loc)+1;
        
        return answer;
    }
}