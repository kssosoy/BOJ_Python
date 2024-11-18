import java.io.*;
import java.util.*;

public class Main {
    public static int bfs(int[][] graph, int rows, int cols) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Queue<int[]> queue = new LinkedList<>();
        int totalDays = 0;

        // 익은 토마토(1)를 모두 큐에 추가
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (graph[i][j] == 1) {
                    queue.add(new int[]{i, j, 0}); // x, y, 일수
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int days = current[2];

            totalDays = Math.max(totalDays, days); // 최대 일수 갱신

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 내에 있고, 익지 않은 토마토(0)만 처리
                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols && graph[nx][ny] == 0) {
                    graph[nx][ny] = 1; // 토마토를 익음 상태로 변경
                    queue.add(new int[]{nx, ny, days + 1});
                }
            }
        }

        // 익지 않은 토마토(0)가 남아있는지 확인
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (graph[i][j] == 0) {
                    return -1; // 익지 않은 토마토가 남아있음
                }
            }
        }

        return totalDays; // 모든 토마토가 익은 데 걸린 시간
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] dimensions = bf.readLine().split(" ");
        int cols = Integer.parseInt(dimensions[0]);
        int rows = Integer.parseInt(dimensions[1]);

        int[][] graph = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] line = bf.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                graph[i][j] = Integer.parseInt(line[j]);
            }
        }

        System.out.println(bfs(graph, rows, cols));
    }
}
