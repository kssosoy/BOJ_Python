import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.SplittableRandom;
import java.util.StringTokenizer;

public class Main {
    // 1. 오른쪽 아래쪽을 탐색한다
    // 2. 탐색 하면서 사탕의 색이 다른 인접한 두 칸을 고른다. (다른색이라면 교환한다)
    // 3. 두 칸을 고른다음에 들어있는 사탕을 서로 교환한다
    // 4. 열과 행을 탐색해서 사탕이 가장 많이 먹을 수 있는 count를 계산한다
    // 5. 더 큰 count 가 있다면 update 한다
    // 6. map을 원상복귀 한다
    //7. 반복한 후에 가장 큰 count를 출력한다
    static int N;
    static char[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        map = new char[N][N];
        for (int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] =s.charAt(j);
            }
        }
        int max_count = 0;
        for (int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(j+1 < N && map[i][j] != map[i][j+1]){
                    char temp = map[i][j];
                    map[i][j] = map[i][j+1];
                    map[i][j+1] = temp;
                    int count = getMaxCandy();
                    if(count > max_count){
                        max_count = count;
                    }
                    temp = map[i][j];
                    map[i][j] = map[i][j+1];
                    map[i][j+1] = temp;
                }
                if(i+1 < N && map[i][j] != map[i+1][j] ){
                    char temp = map[i][j];
                    map[i][j] = map[i+1][j];
                    map[i+1][j] = temp;
                    int count = getMaxCandy();
                    if(count > max_count){
                        max_count = count;
                    }
                    temp = map[i][j];
                    map[i][j] = map[i+1][j];
                    map[i+1][j] = temp;
                }
            }
        }
        System.out.println(max_count);


    }
    public static int getMaxCandy() {
        int maxCandy = 1;

        // 행 검사
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (map[i][j] == map[i][j - 1]) {
                    count++;
                    maxCandy = Math.max(maxCandy, count);
                } else {
                    count = 1;
                }
            }
        }

        // 열 검사
        for (int j = 0; j < N; j++) {
            int count = 1;
            for (int i = 1; i < N; i++) {
                if (map[i][j] == map[i - 1][j]) {
                    count++;
                    maxCandy = Math.max(maxCandy, count);
                } else {
                    count = 1;
                }
            }
        }

        return maxCandy;
    }

}
