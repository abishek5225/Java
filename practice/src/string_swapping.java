public class string_swapping {
    public static void main(String[] args) {
        String x ="Hello";
        String y ="World";
        String temp;
        temp =x;
        x = y;
        y = temp;

        System.out.println("x:"+x);
        System.out.println("y="+y);
    }
}
