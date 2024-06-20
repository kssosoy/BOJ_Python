import java.util.*;

public class Solution {
    public int solution(int s) {
        int answer = 0;
        int n=0;
        String input = Integer.toString(s);
        String [] inputStr = input.split("");
        for (int i=0; i<inputStr.length; i++){
            n= Integer.parseInt(inputStr[i]);
            answer+=n;
        }

        return answer;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        Solution sol = new Solution();
        int result = sol.solution(input);
        
        
    }
}