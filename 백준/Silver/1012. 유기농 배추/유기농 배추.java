import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
    public static void dfs(int start_x, int start_y ,int[][] graph, int[][]visited){
        visited[start_x][start_y]=1;
        int [] dx ={-1,1,0,0};
        int[] dy={0,0,-1,1};

        for(int i=0; i<4;i++){
            int nx=dx[i]+start_x;
            int ny=dy[i]+start_y;
            if(nx>=0 && nx<graph.length && ny>=0 && ny<graph[0].length && visited[nx][ny]!=1 && graph[nx][ny]==1){
                dfs(nx,ny,graph, visited);

            }
        }


    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(bf.readLine());
        int num=0;

        for (int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[][] graph=new int[m][n];
            int[][] visited = new int[m][n];
            for(int j=0; j<k; j++){
                StringTokenizer sf = new StringTokenizer(bf.readLine());
                int num_x = Integer.parseInt(sf.nextToken());
                int num_y = Integer.parseInt(sf.nextToken());
                graph[num_x][num_y]=1;
            }
            for (int x=0; x<m; x++){
                for(int y=0; y<n; y++){
                    if(graph[x][y]==1& visited[x][y]!=1){
                        dfs(x,y,graph,visited);
                        num+=1;
                    }
                }
            }
            System.out.println(num);
            num=0;
        }
        
    }
}