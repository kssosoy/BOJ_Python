import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(sc.nextLine());
            int maxUniv=0;
            HashMap<String, Integer> univ = new HashMap<>();
            for (int j = 0; j < N; j++) {
                String input = sc.nextLine();
                String[] univStr = input.split(" ");
                univ.put(univStr[0], Integer.parseInt(univStr[1]));
                if(maxUniv< Integer.parseInt(univStr[1])){
                    maxUniv=Integer.parseInt(univStr[1]);
                }
            }
            for (Map.Entry<String, Integer> entry: univ.entrySet()){
                if(entry.getValue().equals(maxUniv)){
                    System.out.println(entry.getKey());
                }
            }

            
        }

        sc.close();
    }
}
