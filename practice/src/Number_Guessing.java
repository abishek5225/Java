import java.util.Scanner;

public class Number_Guessing {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int number = (int) (Math.random()*50);
        int usernumber;
        System.out.println("Guess number upto 50");

        do {
            System.out.print("ENter Guess:");
             usernumber=input.nextInt();

            if (usernumber==number){
                System.out.println("Correct Guess");
                break;
            }

             else if (usernumber > number){
                System.out.println("HIgher NUmber Guess lower Number");
            }
                
             else {
                System.out.println("Your number is Small guess Higher Number");
            }
        }while (usernumber>=0);
        System.out.println("Congratulation Correct guess (~~)");
    }
}
