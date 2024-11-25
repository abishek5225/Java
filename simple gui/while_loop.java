import java.util.Scanner;
public class while_loop {
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = "";
        while(name.isBlank()){
            System.out.println("hello");
            System.out.println("Enter your name");
            name= input.nextLine();
        }
        System.out.println("Hello"+name);
    }
}
