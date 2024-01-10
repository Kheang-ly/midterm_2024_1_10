package OOP_Exercise;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(){}

    public double getArea()
    {
        return width*length;
    }
    public double getPerimeter()
    {
        return 2*(width+length);
    }
}
