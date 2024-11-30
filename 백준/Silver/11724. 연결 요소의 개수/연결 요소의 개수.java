import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void dfs(int start, List[] graph, boolean[] visited){
        visited[start]=true;

        for(int i=0; i<graph[start].size(); i++){
            int next= (int) graph[start].get(i);
            if(!visited[next]){
                dfs(next,graph, visited);
            }

        }

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n= Integer.parseInt(st.nextToken());
        int m= Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[n+1];
        List[] graph = new List[n+1];

        for (int j=1; j<n+1; j++){
            graph[j]= new ArrayList<Integer>();
        }

        for (int i=0; i<m; i++){
            StringTokenizer sf = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(sf.nextToken());
            int b = Integer.parseInt(sf.nextToken());
            graph[a].add(b);
            graph[b].add(a);

        }
        int count=0;
        for (int i=1; i<=n; i++){
            if(!visited[i]){
                dfs(i,graph, visited);
                count++;
            }
        }
        System.out.println(count);


    }
}