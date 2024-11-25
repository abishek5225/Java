class pen{
    String color;
    String type;

    public void write(){
        System.out.println("Making an sketch");
    }
    public  void printcolor(){
        System.out.println(this.color);
    }
}
 class Studentinfo{
    String name;
    int rollno;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.rollno);
     }
}
public class OOPS {
    public  static  void main(String[] args){


        Studentinfo info1 = new Studentinfo();
        info1.name="Abishek";
        info1.rollno= 5;



        info1.printinfo();
    }
}
