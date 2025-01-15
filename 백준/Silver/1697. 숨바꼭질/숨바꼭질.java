import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        System.out.println(bfs(N, K));
    }

    static int bfs(int start, int end) {
        visited = new int[100001];
        Arrays.fill(visited, -1);
        visited[start] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        int[] dx = new int[]{-1, 1, 2};

        while (!queue.isEmpty()) {
            int current = queue.poll();


            if (current == end) {
                return visited[current];
            }

            for (int i = 0; i < 3; i++) {
                int next;
                if (dx[i] == 2) {
                    next = current * 2;
                } else {
                    next = current + dx[i];
                }


                if (next >= 0 && next < 100001 && visited[next] == -1) {
                    queue.add(next);
                    visited[next] = visited[current] + 1;
                }
            }
        }
        return -1;
    }
}
