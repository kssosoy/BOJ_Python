import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        int count = sc.nextInt();
        String num = sc.next();
        for(int i=0; i<count; i++){
            total+= num.charAt(i)-'0';
        }
        System.out.println(total);

    }
}
