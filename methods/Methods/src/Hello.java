public class Hello {
    static void Multiplication(int n) {
        for (int i = 1; i <= 10; i++){
            System.out.format("%d*%d= %d\n",n,i, n * i);
        }
    }

    public static void main(String[] args) {
        Multiplication(7);
    }
}
