public class Triangle {
    double height;
    double base;
    double sideA;
    double sideB;

    public Triangle(double height, double base, double sideA, double sideB){
        this.height = height;
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double area(){
        return 0.5 * base * height;
    }

    public double circumference(){
        return base + sideA + sideB;
    }
}
