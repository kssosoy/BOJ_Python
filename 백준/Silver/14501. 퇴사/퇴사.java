import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(bf.readLine());
        int[] t = new int[day];
        int[] p = new int[day];
        int[] money = new int[day + 1];

        for (int i = 0; i < day; i++) {
            String[] input = bf.readLine().split(" ");
            t[i] = Integer.parseInt(input[0]);
            p[i] = Integer.parseInt(input[1]);
        }

        for (int i = 0; i < day; i++) {
            // 상담을 진행하지 않는 경우의 최대 수익을 다음 날로 넘김
            // 경우의 수가 0일수도 있고 날짜에 일할 수 없으면 이전까지 일한 최대 수당을 넣어야함
            money[i + 1] = Math.max(money[i + 1], money[i]);

            // 상담을 진행할 수 있는 경우 (상담이 기간 내에 끝나는 경우)
            // 최대 비용을 더해서 저장
            if (i + t[i] <= day) {
                money[i + t[i]] = Math.max(money[i + t[i]], money[i] + p[i]);
            }
        }

        System.out.println(money[day]);
    }
}