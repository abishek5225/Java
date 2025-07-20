class Cylinder{
    double height;
    double radius;

    public void setdata(double height, double radius){
        this.height= height;
        this.radius= radius;
    }
    public double area(){
        return 2*radius*height+2*3.14*radius*radius;
    }

    public  double perimeter(){
        return 2*3.14*radius*height;
    }
}
public class O2 {
    public  static void main(String[] args){
    Cylinder cylinder = new Cylinder();


    cylinder.setdata(10,20);

    double Area= cylinder.area();
        System.out.println("Area:"+Area);

        double perimeter= cylinder.perimeter();
        System.out.println("perimeter:"+perimeter);
    }
}
