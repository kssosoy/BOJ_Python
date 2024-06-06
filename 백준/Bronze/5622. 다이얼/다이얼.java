import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'A' || input.charAt(i) == 'B' || input.charAt(i) == 'C') {
                count += 3;
            }
            else if(input.charAt(i) == 'D' || input.charAt(i) == 'E' || input.charAt(i) == 'F'){
                count+=4;
            }
            else if(input.charAt(i) == 'G' || input.charAt(i) == 'H' || input.charAt(i) == 'I'){
                count+=5;
            }
            else if(input.charAt(i) == 'J' || input.charAt(i) == 'K' || input.charAt(i) == 'L'){
                count+=6;
            }
            else if(input.charAt(i) == 'M' || input.charAt(i) == 'N' || input.charAt(i) == 'O'){
                count+=7;
            }
            else if(input.charAt(i) == 'P' || input.charAt(i) == 'Q' || input.charAt(i) == 'R'||input.charAt(i)=='S'){
                count+=8;
            }
            else if(input.charAt(i) == 'T' || input.charAt(i) == 'U' || input.charAt(i) == 'V'){
                count+=9;
            }
            else if(input.charAt(i) == 'W' || input.charAt(i) == 'X' || input.charAt(i) == 'Y'||input.charAt(i)=='Z'){
                count+=10;
            }
            else{
                count+=11;
            }
        }
        System.out.println(count);
    }
}
