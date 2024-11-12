import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] matrix;
    static boolean[] team;
    static int minDifference = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        matrix = new int[N][N];
        team = new boolean[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0; j < N; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divideTeam(0, 0);
        System.out.println(minDifference);
    }


    static void divideTeam(int index, int count) {
        if (count == N / 2) {
            calculateDifference();
            return;
        }

        for (int i = index; i < N; i++) {
            if (!team[i]) {
                team[i] = true;
                divideTeam(i + 1, count + 1);
                team[i] = false;
            }
        }
    }


    static void calculateDifference() {
        int startScore = 0;
        int linkScore = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (team[i] && team[j]) {
                    startScore += matrix[i][j];
                } else if (!team[i] && !team[j]) {
                    linkScore += matrix[i][j];
                }
            }
        }

        int difference = Math.abs(startScore - linkScore);
        minDifference = Math.min(minDifference, difference);
    }
}
