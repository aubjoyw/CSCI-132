package csci132.Lab2;

public class Rectangle {

    public double height;
    public double width;


    public Rectangle(double x, double y){
        height = x;
        width = y;
    }

    public Rectangle(double x) {
        height = x;
        width = x;
    }

    public double calculate_perimeter() {
        return (2*height) + (2*width);
    }

    public double calculate_area(){
        return height*width;
    }


}
