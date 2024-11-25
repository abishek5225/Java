import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        System.out.println("Enter input:");
        int [][]a=new int[4][4];
        Scanner input=new Scanner(System.in);
        for (int i=0;i<4;i++){
            for (int y=0;y<4;y++){
                    a[i][y]=input.nextInt();
            }
        }
        System.out.println("In Matrix Form:");
        for (int i=0;i<4;i++){
            for (int y=0;y<4;y++){
                    System.out.print(a[i][y]+" ");
            }
            System.out.println();
        }
    }
}
