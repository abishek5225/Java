import java.util.ArrayList;
public class array_list {
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("Burger");
        food.add("Fried rice");
        food.add("MOMO");
        food.add("Chicken fry");


        food.set(0,"Sekuwa");


        for (int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
