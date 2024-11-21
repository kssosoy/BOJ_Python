import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static class Node{
        int x;
        int time;
        public Node(int x, int time){
            this.x=x;
            this.time=time;
        }
    }
    public static int bfs(int start_num, int end_num) {
        int min = Integer.MAX_VALUE;
        int max_size = 100001;
        int[] visited = new int[max_size];
        Queue<Node> queue = new LinkedList<>();
        visited[start_num] = 1;
        queue.offer(new Node(start_num,0));

        while (!queue.isEmpty()) {
            Node current  = queue.poll();
            if(current.x == end_num){
                min=Math.min(min,current.time);
            }

            if(current.x*2<max_size &&visited[current.x*2]!=1){
                visited[current.x*2]=1;
                queue.offer(new Node(current.x*2,current.time));
            }
            if(current.x-1>=0&&visited[current.x-1]!=1){
                visited[current.x-1]=1;
                queue.offer(new Node(current.x-1, current.time+1));
            }
            if(current.x+1<max_size &&visited[current.x+1]!=1){
                visited[current.x+1]=1;
                queue.offer(new Node(current.x+1, current.time+1));
            }
        }
        return min;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input= br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        System.out.println(bfs(n,k));


    }
}