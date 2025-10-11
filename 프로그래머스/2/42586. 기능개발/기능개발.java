import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> resultList = new ArrayList<>();
        Deque<Integer> d = new ArrayDeque<>();

        for(int i = 0; i < speeds.length; i++){
            int remainingWork = 100 - progresses[i];
            int days = (int) Math.ceil((double) remainingWork / speeds[i]);
            d.addLast(days);
        }

        if (d.isEmpty()) {
            return new int[0];
        }

        int last = d.pollFirst();
        int count = 1;

        while(!d.isEmpty()){
            if(last < d.peekFirst()){
                resultList.add(count);
                count = 1;
                last = d.pollFirst();
            }
            else{
                count++;
                d.pollFirst();
            }
        }
        
        resultList.add(count);

        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}