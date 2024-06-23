import java.util.Scanner;
import java.util.ArrayList;
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for (int i=0; i<number.length-2; i++){
            for (int j=i+1; j<number.length-1; j++){
                for(int k=j+1; k<number.length; k++){
                    
                    if(number[i]+number[j]+number[k]==0){
                        answer+=1;   
                    }
                    
                }
            }
            
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums= new ArrayList<>();
        while (sc.hasNextInt()){
            nums.add(sc.nextInt());
        }
        int[] array = new int[nums.size()];
        for (int i=0; i<nums.size(); i++){
            array[i]=nums.get(i);
        }
        Solution sol = new Solution();
        int result = sol.solution(array);

    }
}