class Solution {
    public String solution(String s, int n) {
       
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            
            int tempN = n; 

            
            if(c == ' ') {
                sb.append(c);
                continue;
            }

            while (tempN > 0) {
                
                if (c == 'z') {
                    c = 'a';
                } 
                else if (c == 'Z') {
                    c = 'A';
                } 
                else {
                    c = (char) (c + 1);
                }
                
                
                tempN--; 
            }
            sb.append(c);
        }

        return sb.toString();
    }
}