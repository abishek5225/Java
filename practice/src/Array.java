import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int []a=new int[5];
        System.out.println("Random input");
        Scanner input=new Scanner(System.in);
        for (int i=0;i<5;i++){
            a[i] =input.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Result");
        for (int b:a){
            System.out.print(b+" ");
        }
    }
}
