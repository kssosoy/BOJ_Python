class Solution {
    public int solution(int n) {
        int[] array = new int[n];
        int answer = 0;
        for (int i=0; i<n; i++){
            array[i]=i+1;
        }
        
        int sum = 0;
        int start = 0;

        
        for (int end = 0; end < array.length; end++) {
            sum += array[end];
            
            while (sum > n && start <= end) {
                sum -= array[start];
                start++;
            }
            
            if (sum == n) {
                answer++;
            }
        }
     
        return answer;
    }
}