import java.util.Scanner;
class Solution {
    public int[] solution(long n) {
        String input = Long.toString(n);
        String[] inputStr = input.split("");
        int[] answer = new int[inputStr.length];
        int j=0;
        for (int i =inputStr.length-1; i>=0; i--){
            answer[j]=Integer.parseInt(inputStr[i]);
            j++;
            
        }
        
        return answer;
    }
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    long input = sc.nextLong();
    Solution sol = new Solution();
    int[] answer = sol.solution(input);
    
}
}
