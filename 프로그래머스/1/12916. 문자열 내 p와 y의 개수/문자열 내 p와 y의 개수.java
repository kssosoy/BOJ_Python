import java.util.Arrays;
import java.util.Scanner;

class Solution {
    boolean solution(String s) {
        int pcount = 0;
        int ycount = 0;
        
        String[] solStr = s.split("");
        
        System.out.println(Arrays.toString(solStr));
        
        for (int i = 0; i < solStr.length; i++) {
            if (solStr[i].equals("p") || solStr[i].equals("P")) {
                pcount++;
            } else if (solStr[i].equals("y") || solStr[i].equals("Y")) {
                ycount++;
            }
        }
        
        boolean answer = pcount == ycount;
        
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Solution sol = new Solution();
        boolean result = sol.solution(input);
        
    }
}

