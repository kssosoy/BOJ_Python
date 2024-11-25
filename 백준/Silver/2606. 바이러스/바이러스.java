import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static int dfs(int start, List[] graph, boolean[] visited){
        visited[start]=true;
        int count=1;

        for(int i=0; i<graph[start].size(); i++){
            int next= (int) graph[start].get(i);
            if(!visited[next]){
                count+=dfs(next,graph, visited);
            }

        }
        return count;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(bf.readLine());
        int num= Integer.parseInt(bf.readLine());
        boolean[] visited = new boolean[computer+1];
        List[] graph = new List[computer+1];

        for (int j=1; j<computer+1; j++){
            graph[j]= new ArrayList<Integer>();
        }

        for (int i=0; i<num; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);

        }
        System.out.println(dfs(1,graph, visited)-1);


    }
}