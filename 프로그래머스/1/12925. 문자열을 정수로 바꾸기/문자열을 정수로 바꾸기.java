import java.util.Scanner;
class Solution {
    public int solution(String s) {
        int answer = 0;
       
        answer= Integer.parseInt(s);
        return answer;
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    Solution sol = new Solution();
    int result= sol.solution(input);
}
}
