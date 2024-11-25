
import java.util.Scanner;
public class simple_interest {
    public static void main(String[] args) {
        int p;
        int t;
        int r;
        int SI;
        int i;
        Scanner input= new Scanner(System.in);
        System.out.print("principle:\n" );
        p= input.nextInt();
        System.out.print("time:\n" );
        t= input.nextInt();
        System.out.print("rate:\n" );
        r= input.nextInt();

        SI= p*t*r/100;
        System.out.print(SI);



    }
}
