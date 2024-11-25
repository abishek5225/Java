import java.util.Scanner;

public class practice {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first num:");
        double a = input.nextInt();
        System.out.println("Enter second num:");
        double b = input.nextInt();

        double c=a+b;
        System.out.println("Sum:"+c);
    }
}
