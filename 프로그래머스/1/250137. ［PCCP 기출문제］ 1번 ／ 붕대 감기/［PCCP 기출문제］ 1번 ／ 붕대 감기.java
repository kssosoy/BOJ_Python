//t초 동안 x만큼의 체력 회복
// 연속감기에 성공하면 y만큼의 체력 추가 회복
// 현재체력<최대체력 이어야 함 
// 공격 당하면 회복 x 공격 끝나고 다시 회복, 연속 성공 시간 0으로 초기화
// 공격 당하면 체력 - 피해량 
// 체력 < 0 이면 종료 return -1
// else 남은 체력 return (남은체력 answer)
// bandage [시전 시간, 초당 회복량, 추가 회복량], attacks [공격시간, 피해량]
// 최대체력 health
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int[] band = new int[attacks.length-1];
        for(int i=0; i<attacks.length-1; i++){
            band[i]=attacks[i+1][0]-attacks[i][0]-1;
        }
        int[] temp = new int[band.length];
        int num=0;
        for(int i=0; i<band.length; i++){
            int gap=band[i];
            temp[i] = (gap * bandage[1]) + (gap / bandage[0] * bandage[2]);
        }
        answer=health;
        for(int i=0; i<attacks.length; i++){
            answer-=attacks[i][1];
            if(answer<=0){
                return -1;
            }
            
            if(i<temp.length){
                answer+=temp[i];
                if(answer>health){
                    answer=health;
                }
            }
        }
        return answer;
    }
}