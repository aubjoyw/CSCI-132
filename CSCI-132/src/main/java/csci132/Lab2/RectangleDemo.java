package csci132.Lab2;

public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        Rectangle square = new Rectangle(5);
        System.out.println("Areas:");
        System.out.println("Rectangle: " + rectangle.calculate_area());
        System.out.println("Square: " + square.calculate_area());
        System.out.println("Perimeters:");
        System.out.println("Rectangle: "+ rectangle.calculate_perimeter());
        System.out.println("Square: " + square.calculate_perimeter());
    }
}
