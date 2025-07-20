import java.util.Scanner;
public class questions {
    public static void  main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Are you virgin?");
        String vi = input.nextLine();



        System.out.println("Hello"+name);
        System.out.println("You are "+age+" years old ");
        System.out.println(""+vi+" your'e virgin");
    }
}
