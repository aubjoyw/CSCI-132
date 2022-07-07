package csci132.Lab2;

public class Rectangle {

    public double height;
    public double width;


    public Rectangle(double l, double w){
        height = l;
        width = w;
    }

    public Rectangle(double n) {
        height = n;
        width = n;
    }

    public double calculate_perimeter() {
        return (2*height) + (2*width);
    }

    public double calculate_area(){
        return height*width;
    }


}
