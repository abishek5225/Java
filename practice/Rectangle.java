
class Rect {
    double length;
    double width;

    public void setDimensions(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        // Create a rectangle object
        Rect rectangle = new Rect();

        // Set the dimensions using the setter method
        rectangle.setDimensions(5.0, 3.0);

        // Calculate and display the area
        double area = rectangle.calculateArea();
        System.out.println("Area: " + area);

        // Calculate and display the perimeter
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter: " + perimeter);
    }
}
