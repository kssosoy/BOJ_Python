import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int j=2;
            int result=1;


            if (A == 1 || B == 1) {
                if (A >= B) {
                    System.out.println(A);
                } else {
                    System.out.println(B);
                }
            } else{

                while (j<=min(A,B)){
                    if(A%j !=0 || B%j !=0){
                        j+=1;
                    }
                    else{
                        result*=j;
                        A=A/j;
                        B=B/j;

                    }
                }
                System.out.println(result*A*B);
            }

        }

        sc.close();
    }
}
