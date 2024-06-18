import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ArrayList<String> plate = new ArrayList<>();
        String input = sc.next();
        Collections.addAll(plate, input.split(""));
        int result=10;
        String prev="";
        for(int i=1; i<plate.size(); i++){
            prev=plate.get(i-1);
            if(plate.get(i).equals(prev)){
                result+=5;
            }
            else{
                result+=10;
            }
        }
        System.out.println(result);
    }
}
