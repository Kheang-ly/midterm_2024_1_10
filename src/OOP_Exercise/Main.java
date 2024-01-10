package OOP_Exercise;
public class Main {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(3,4);
        System.out.println(" Area of Rectangle: ".concat(r.getArea()+""));
        System.out.println(" Perimeter of Rectangle: ".concat(r.getPerimeter()+""));
        System.out.println();
        Square s=new Square(7);
        System.out.println(" Area of Square: ".concat(s.getArea()+""));
        System.out.println(" Perimeter of Square: ".concat(s.getPerimeter()+""));

    }
}