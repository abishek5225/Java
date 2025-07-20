class Circle{
    double radius;

    public void setdata(double radius){

        this.radius=radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
public class o1 {
    public static void main(String[] args){
        Circle obj1 = new Circle();

        obj1.setdata(10);

        double area= obj1.area();
        System.out.println("Area:"+area);
    }
}



