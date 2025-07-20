import java.awt.geom.Area;

class Rectangleworks{
    double length;
    double breadth;

    public void setdata(double length, double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public  double Area(){
        return length*breadth;
    }

    public  double perimeter(){
        return 2*(length + breadth);
    }
}

public class ooop {

    public static void main(String[] args){

        Rectangleworks obj1= new Rectangleworks();

        obj1.setdata(10,20);
        double area = obj1.Area();
        System.out.println("Area:"+ area);

        double perimeter= obj1.perimeter();
        System.out.println("perimeter"+perimeter);

    }
}
