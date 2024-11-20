import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

class Node{
    int x,y;
    public Node(int x, int y){
        this.x=x;
        this.y=y;
    }

}
public class Main {

    public static void bfs(int startX, int startY, int[][]graph, boolean[][] visited){
        int[] dx={-1,1,0,0};
        int[] dy={0,0,-1,1};

        Queue<Node> num= new LinkedList<>();
        num.offer(new Node(startX, startY));
        visited[startX][startY]=true;


        while (!num.isEmpty()){
            Node current = num.poll();
            for (int i=0; i<4; i++){
                int newX = current.x +dx[i];
                int newY = current.y +dy[i];
                if (newX >= 0 && newX < graph.length && newY >= 0 && newY < graph[0].length) {
                    if (!visited[newX][newY] && graph[newX][newY] == 1) {
                        num.offer(new Node(newX, newY));
                        visited[newX][newY] = true;
                    }
                }
            }
        }


    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(bf.readLine());
        for (int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int count=0;
            int[][] cabbage = new int[M][N];
            boolean[][] visited = new boolean[M][N];
            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    cabbage[x][y] = 0;
                }
            }
            for (int j=0; j<K; j++){
                st= new StringTokenizer(bf.readLine());
                int row = Integer.parseInt(st.nextToken());
                int col = Integer.parseInt(st.nextToken());
                cabbage[row][col]=1;
            }

            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (!visited[x][y] && cabbage[x][y] == 1) {
                        bfs(x, y, cabbage, visited);
                        count++;
                    }
                }
            }
            System.out.println(count);


        }



    }
}

