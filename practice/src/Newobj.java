public class Newobj {


        double length;
        double breadth;

    public void setdata(double length , double breadth){
        this.length=length;
        this.breadth =breadth;
    }
    public double center(){
        return length+breadth;
    }

   public static void main(String[] args){
        Newobj obj1 = new Newobj();
       obj1.setdata(10,20);
       double center=obj1.center();
       System.out.println("cener:"+center);

   }
}
