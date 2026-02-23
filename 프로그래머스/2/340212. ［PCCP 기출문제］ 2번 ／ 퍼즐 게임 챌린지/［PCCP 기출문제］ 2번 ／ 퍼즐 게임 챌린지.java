//현재 퍼즐의 난이도 diff, 현재 퍼즐의 소요 시간 time_cur, 이전 퍼즐의 소요 시간 time_prev, 숙련도 level
// diff<= level -> time_cur 시간 사용하여 해결
// diff> level -> diff-level 번 틀리고 틀릴때마다 (time_prev+ time_cur) * (diff-level) +time_cur
// 
class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        
        
        int low=1;
        int high=1000000;
        int answer = high;

        while(low<=high){
            int level= (low+high)/2;
            long time=0;
            int time_prev=0;
            for(int i=0; i<diffs.length; i++){
            if(diffs[i]<=level){
                time+=times[i];
                time_prev=times[i];
            }
            else{
                time+=(long)(time_prev+times[i])*(diffs[i]-level)+times[i];
                time_prev=times[i];
            }
                if (time > limit) break;
        }
            if (time <= limit) {
                answer = level; 
                high = level - 1; 
            } else {
                low = level + 1; 
            }
        }
        
        return answer;
    }
}