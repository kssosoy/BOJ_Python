import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int N = Integer.parseInt(br.readLine());
        if (N == 1) {
            System.out.println(3);
            return;
        }
        if (N == 2) {
            System.out.println(7);
            return;
        }

        int[] matrix = new int[N + 1];
        matrix[1] = 3;
        matrix[2] = 7;

        for (int i = 3; i <= N; i++) {
            matrix[i] = (matrix[i - 1] * 2 + matrix[i - 2]) % 9901;
        }

        System.out.println(matrix[N]);
    }
}