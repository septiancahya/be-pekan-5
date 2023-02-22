public class Circle {
    final double phi = 3.14;
    double radius;

    public double area(){
        return phi * (radius * radius);
    }

    public double circumference(){
        return 2 * phi * radius;
    }
}
