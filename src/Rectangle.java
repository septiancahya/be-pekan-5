public class Rectangle {
    double width;
    double length;

    public double area(){
        return width * length;
    }

    public double circumference(){
        return (2 * width) + (2 * length);
    }
}
