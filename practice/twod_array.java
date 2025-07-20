import java.util.*;
public class twod_array {
    public static void main(String[] args) {
    /*2D Array list= a dynamic list of lists
     you can change the size of these lists during run time*/



        ArrayList<ArrayList<String>> supermarketList = new ArrayList<>();
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pizza");
        bakeryList.add("burger");
        bakeryList.add("fried rice");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("vodka");
        drinkList.add("Mustang");
        drinkList.add("Gorkha strong");


        ArrayList<String> noodleList= new ArrayList<>();
        noodleList.add("2pm");
        noodleList.add("Current");
        noodleList.add("Rumpum");

        supermarketList.add(bakeryList);
        supermarketList.add(drinkList);
        supermarketList.add(noodleList);


        System.out.println(supermarketList);
        System.out.println(drinkList);
        System.out.println(bakeryList);
        System.out.println(noodleList);

        System.out.println(supermarketList.get(1).get(0));

        ArrayList<ArrayList<Integer>> numberList= new ArrayList<>();
        ArrayList<Integer> firstList =new ArrayList<>();
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);


        ArrayList<Integer> secondList =new ArrayList<>();
        secondList.add(1);
        secondList.add(2);
        secondList.add(3);

        ArrayList<Integer> thirdList =new ArrayList<>();
        thirdList.add(1);
        thirdList.add(2);
        thirdList.add(3);

        numberList.add(firstList);
        numberList.add(secondList);
        numberList.add(thirdList);
        System.out.println(numberList);

        System.out.println(firstList);
        System.out.println(secondList);
        System.out.println(thirdList);


        System.out.println();






    }
}
