import java.util.Scanner;
public class hello {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("HELLO BACK BENCHERS");
        System.out.println("LETS CODE NOW");
        int rows;
        int columns;
        String symbol="";
        System.out.println("Enter # of rows:");
        rows = input.nextInt();
        System.out.println("Enter # of Columns:");
        columns = input.nextInt();
        System.out.println("Enter Symbol to use:");
        symbol = input.next();

        for (int i=1; i<=rows;i++){
            System.out.println();
            for (int j=1; j<=columns; j++){
                System.out.print(symbol);
            }
        }

    }
}