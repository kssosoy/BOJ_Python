import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int dfs(int start_x, int start_y ,int[][] graph, int[][]visited){
        visited[start_x][start_y]=1;
        int count=1;
        int [] dx ={-1,1,0,0};
        int[] dy={0,0,-1,1};

        for(int i=0; i<4;i++){
            int nx=dx[i]+start_x;
            int ny=dy[i]+start_y;
            if(nx>=0 && nx<graph.length && ny>=0 && ny<graph[0].length && visited[nx][ny]!=1 && graph[nx][ny]==1){
                count+=dfs(nx,ny,graph, visited);

            }
        }
        return count;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(bf.readLine());
        int num=0;
        int[][] graph = new int[n][n];
        int[][] visited= new int[n][n];
        List<Integer>result = new LinkedList<>();

        for (int i=0; i<n; i++){
            String line = bf.readLine();
            for(int j=0; j<n; j++){
                graph[i][j] = line.charAt(j)-'0';
            }
        }
        for (int x=0; x<n; x++){
            for(int y=0; y<n; y++){
                if(graph[x][y]==1& visited[x][y]!=1){
                    result.add(dfs(x,y,graph,visited));
                    num+=1;
                }
            }
        }
        System.out.println(num);
        Collections.sort(result);
        for (int j=0; j<result.size(); j++){
            System.out.println(result.get(j));
        }






    }
}