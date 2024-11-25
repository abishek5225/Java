import java.util.*;
public class A1 {
    public static void main(String[] args) {
        ArrayList <Integer> input=new ArrayList<>();
        input.add(1);
        input.add(5);
        input.add(3);

        System.out.println("Array list:"+input);
        Arrays.sort(new ArrayList[]{input});
        for (int c:input) {
            System.out.println(c);
        }
    }

}
