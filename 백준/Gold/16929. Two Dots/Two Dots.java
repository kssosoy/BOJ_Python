import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] arr;
    static int n, m;
    static boolean isExists = false;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    static void dfs(int x, int y, int px, int py, char color, int depth, boolean[][] visited) {
        visited[x][y] = true;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == color) {
                if (!visited[nx][ny]) {
                    dfs(nx, ny, x, y, color, depth + 1, visited);
                } else if (!(nx == px && ny == py) && depth >= 4) {
                    isExists = true;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                boolean[][] visited = new boolean[n][m];  
                dfs(i, j, -1, -1, arr[i][j], 1, visited);
                if (isExists) {
                    System.out.println("Yes");
                    return;
                }
            }
        }

        System.out.println("No");
    }
}

