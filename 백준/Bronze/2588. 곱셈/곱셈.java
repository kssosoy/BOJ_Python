import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n1= b/100;
        int n2= (b - (n1*100))/10;
        int n3 = (b-(n1*100)-(n2*10));
        System.out.println(a*n3);
        System.out.println(a*n2);
        System.out.println(a*n1);
        System.out.println(a*b);

    }
}