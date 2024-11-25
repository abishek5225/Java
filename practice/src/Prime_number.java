import java.util.Scanner;
public class Prime_number {
    public static void main(String[] args) {
        int prime;
        int comp;
        int num;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter a number:\n" );
        num= input.nextInt();
        boolean isPrime = true;
        if (num < 2) {
            isPrime = false;
        }
        else {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }

    }
}
