import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] graph;
    static int[] visited;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(bf.readLine());

        graph =new int[n];
        st = new StringTokenizer(bf.readLine());

        for (int i=0; i<n; i++){
            graph[i]=Integer.parseInt(st.nextToken());
        }

        st= new StringTokenizer(bf.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end =Integer.parseInt(st.nextToken());

        System.out.println(bfs(start,end));

    }
    static int bfs(int start, int end){
        visited= new int[n+1];
        Arrays.fill(visited, -1);
        Queue<Integer> queue =new LinkedList<>();

        queue.add(start);
        visited[start]=0;

        while(!queue.isEmpty()){
            int current = queue.poll();
            int jumpsize = graph[current-1];

            int forward =current;

            for(int next = current + jumpsize; next <= n; next += jumpsize) {
                if(visited[next] == -1) {  // 방문하지 않은 위치만 처리
                    visited[next] = visited[current] + 1;
                    queue.add(next);
                }
            }

            // 뒤로 점프
            for(int next = current - jumpsize; next >= 1; next -= jumpsize) {
                if(visited[next] == -1) {  // 방문하지 않은 위치만 처리
                    visited[next] = visited[current] + 1;
                    queue.add(next);
                }
            }


        }

        return visited[end];

    }

}