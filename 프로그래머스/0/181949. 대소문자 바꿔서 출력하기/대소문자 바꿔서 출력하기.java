import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] arr = a.toCharArray();

        for(int i=0; i<arr.length; i++){
            int asc = (byte)arr[i];
            if(asc>=65 && asc <= 90){
                asc = asc + 32;
            }else{
                asc = asc - 32;
            }
            arr[i] = (char)asc;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}