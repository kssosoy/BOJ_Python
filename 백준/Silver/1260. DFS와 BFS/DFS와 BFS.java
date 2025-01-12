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
    static boolean[] visited;
    static List<Integer>[] list;



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        list = new ArrayList[N+1];
        for (int i=0; i<=N; i++){
            list[i] = new ArrayList<>();
        }
        for (int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list[a].add(b);
            list[b].add(a);
        }

        for (int i=0; i<=N; i++){
            Collections.sort(list[i]);
        }

        visited = new boolean[N+1];
        dfs(list, visited, V);

        System.out.println();

        visited = new boolean[N+1];
        bfs(list, visited, V);

    }

    static void dfs(List<Integer>[] list, boolean[] visited, int V){
        visited[V] = true;
        System.out.print(V + " ");
        for (int i : list[V]){
            if (!visited[i]){
                dfs(list, visited, i);
            }
        }
    }

    static void bfs(List<Integer>[] list, boolean[] visited, int V){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visited[V] = true;
        while (!queue.isEmpty()){
            int temp = queue.poll();
            System.out.print(temp + " ");
            for (int i : list[temp]){
                if (!visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}