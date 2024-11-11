import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int money= Integer.parseInt(bf.readLine());
        int[] arr = new int[14];
        String[] inputs =bf.readLine().split(" ");
        for(int i=0; i<14; i++){
            arr[i]=Integer.parseInt(inputs[i]);
        }
        int Jun=Junhyun(money, arr);
        int Sung = Sungmin(money, arr);

        if(Jun>Sung){
            System.out.println("BNP");
        }
        else if(Sung>Jun){
            System.out.println("TIMING");
        }
        else{
            System.out.println("SAMESAME");
        }


    }
    public static int Junhyun(int money, int[] arr) {
        int stock_count = 0;
        for (int i = 0; i < 14; i++) {
            if (money > 0 && money >= arr[i]) {
                stock_count += money / arr[i];
                money -= (money / arr[i]) * arr[i];
            }
        }
        money+=stock_count*arr[13];
        return money;
    }

    public static int Sungmin(int money, int[] arr) {
        int stock_count = 0;
        for (int i = 3; i < 14; i++) {
            if ((arr[i-3]<arr[i-2])&&(arr[i-2]<arr[i-1])&&(arr[i-1]<arr[i])&& stock_count>0){
                money += stock_count * arr[i];
                stock_count = 0;
            }
            else if ((arr[i-3]>arr[i-2])&&(arr[i-2]>arr[i-1])&&(arr[i-1]>arr[i])) {
                if (money >= arr[i]) {
                    stock_count += money / arr[i];
                    money %= arr[i];
                }
            }
        }
        money+=stock_count*arr[13];

        return money;
    }

}
