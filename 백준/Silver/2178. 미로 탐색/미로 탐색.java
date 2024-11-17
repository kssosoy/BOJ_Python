import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static int bfs(int startX, int startY, int endX, int endY, char[][] graph){
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(new int[]{startX, startY,1});
        visited.add(startX+","+startY);

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x =current[0];
            int y = current[1];
            int length = current[2];

            if(x==endX&&y==endY){
                return length;
            }

            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];

                if(nx>=0 && nx<graph.length && ny>=0 && ny<graph[0].length){
                    if(graph[nx][ny] == '1'&& !visited.contains(nx+","+ny)){
                        visited.add(nx+","+ny);
                        queue.add(new int[]{nx,ny,length+1});
                    }
                }
            }

        }
        return -1;


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String [] dimensions = bf.readLine().split(" ");
        int a = Integer.parseInt(dimensions[0]);
        int b = Integer.parseInt(dimensions[1]);

        char[][] graph = new char[a][b];
        for(int i=0; i<a; i++){
            graph[i]=bf.readLine().toCharArray();
        }
        System.out.println(bfs(0,0,a-1,b-1,graph));


    }
}

