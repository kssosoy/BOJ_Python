import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double S= Double.parseDouble(sc.next());
        int count=0;
        int i=1;
        while (S>0){
            S-=i;
            if(S<0){
                break;
            }
            i+=1;
            count+=1;
        }
        System.out.println(count);


    }
}
