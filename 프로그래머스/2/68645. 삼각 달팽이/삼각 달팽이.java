class Solution {
    public int[] solution(int n) {
        
        int num=n*(n+1)/2;
        
        int[][] matrix = new int[n][n];
        int c=1;
        int d=n;
        int[] state= {0,1,2};
        int x=-1, y=0;
        //0 : 아래, 1: 오른쪽 ,2 :대각선 위
        while(c<=num){
            for(int s : state){
                if(s==0){
                    for(int i=0; i<d; i++){
                        x++;
                        matrix[x][y]=c;
                        c++;
                    }
                    d--;
                    
                }
                else if(s==1){
                     for(int i=0; i<d; i++){
                        y++;
                        matrix[x][y]=c;
                        c++;
                    }
                    d--;
                    
                }
                else{
                    for(int i=0; i<d; i++){
                        x--;
                        y--;
                        matrix[x][y]=c;
                        c++;
                    }
                    d--;
                    
                }
                
            }
            
        }
        int[] answer = new int[num];
        int idx=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]!=0){
                    answer[idx++]=matrix[i][j];
                }
            }
        }
        return answer;
    }
}