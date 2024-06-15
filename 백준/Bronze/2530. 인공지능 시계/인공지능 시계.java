import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour= sc.nextInt();
        int min = sc.nextInt();
        int sec= sc.nextInt();
        int timeSec=sc.nextInt();
        sec+=timeSec;
        min+=sec/60;
        sec=sec%60;
        if(min>=60){
            hour+=min/60;
            min=min%60;
        }
        if(hour>=24){
            hour=hour%24;
        }
        System.out.printf("%d %d %d",hour, min, sec);


    }
}
