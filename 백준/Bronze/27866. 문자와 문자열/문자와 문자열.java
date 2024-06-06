import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String InputStr = sc.next();
        int num = sc.nextInt();
        System.out.println(InputStr.charAt(num-1));
    }
}