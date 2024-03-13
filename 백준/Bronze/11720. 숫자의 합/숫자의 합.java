import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sNum = sc.next();
        int sum = 0;
        char[] cNum = sNum.toCharArray();

        for(int i=0; i<n; i++){
            sum += cNum[i] - 48;
        }

        System.out.println(sum);

    }
}
