import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=Integer.parseInt(sc.nextLine());
        for(int i=0; i<T; i++){
            String str= sc.nextLine();
            String[] array=str.split(" ");
            float num= Float.parseFloat(array[0]);
            for (int j=1; j<array.length; j++){
                if(array[j].equals("@")){
                    num*=3;
                }
                else if(array[j].equals("%")){
                    num+=5;
                }
                else if(array[j].equals("#")){
                    num-=7;
                }

            }
            System.out.printf("%.2f\n",num);

        }

    }
}