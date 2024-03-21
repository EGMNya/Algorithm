import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        char cNum[] = in.toCharArray();
        int iNum[] = new int[cNum.length];

        for(int i=0; i<cNum.length; i++){
            iNum[i] = cNum[i] - 48;
        }

        int max;
        int temp=0;
        for(int j=0; j<cNum.length; j++){
            max=iNum[j];
            for(int i=j; i<cNum.length; i++){
                if(iNum[i]>max) {
                    max = iNum[i];
                    temp = iNum[j];
                    iNum[j] = iNum[i];
                    iNum[i] = temp;
                }
            }
        }

        for(int i=0; i<iNum.length; i++){
            System.out.print(iNum[i]);
        }

    }
}
