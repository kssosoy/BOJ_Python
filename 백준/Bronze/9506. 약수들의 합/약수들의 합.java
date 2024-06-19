import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int num = sc.nextInt();
            ArrayList<Integer> yak = new ArrayList<>();
            int sum = 0;
            StringBuilder expression = new StringBuilder();

            if(num == -1){
                break;
            }

            for (int i = 1; i < num; i++){
                if(num % i == 0) {
                    yak.add(i);
                }
            }

            for (int j = 0; j < yak.size(); j++) {
                sum += yak.get(j);
                expression.append(yak.get(j));
                if(j != yak.size() - 1){
                    expression.append(" + ");
                }
            }

            if(sum == num){
                System.out.printf("%d = %s\n", num, expression.toString());
            } else {
                System.out.printf("%d is NOT perfect.\n", num);
            }
        }

        sc.close();
    }
}
