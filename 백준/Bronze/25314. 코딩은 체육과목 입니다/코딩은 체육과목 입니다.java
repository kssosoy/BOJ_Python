import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int num=n/4;
        String s= "";
        for (int i=0; i<num; i++){
            s+="long ";
        }
        System.out.println(s+"int");
    }
}