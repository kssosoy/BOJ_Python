import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] graph;
    static boolean[] visited;
    static int[] result;
    static int n;
    static int m;
    static void dfs(int idx, int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = idx; i < n; i++) {
            result[depth] = graph[i];
            dfs(i + 1, depth + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        graph = new int[n];
        for(int i=0; i<n; i++){
            graph[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(graph);
        visited =new boolean[graph.length];
        result =new int[m];
        dfs(0, 0);

    }
}
