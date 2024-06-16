import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        BigInteger A = new BigInteger(sc.nextLine());
        String str = sc.nextLine();
        BigInteger B = new BigInteger(sc.nextLine());
        if(str.equals("*")){
            System.out.println(A.multiply(B));
        }
        else if(str.equals("+")){
            System.out.println(A.add(B));
        }
    }
}
