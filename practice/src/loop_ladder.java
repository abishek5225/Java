import java.util.Scanner;
public class loop_ladder {
    public static  void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int a=input.nextInt();

        for (int i=0;i<=a;i++){
            for (int j=0;j<=i;j++){
                for (int k=i-1;k>=1;k--){
                    System.out.print(k);
                }
                System.out.println();
            }

        }

    }
}
