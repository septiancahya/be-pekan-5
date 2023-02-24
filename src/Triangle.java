public class Triangle extends FlatFigure {
    double height;
    double base;
    double sideA;
    double sideB;

    public Triangle(double height, double base, double sideA, double sideB) {
        this.height = height;
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    void type(){
        System.out.println("SEGITIGA");
    }

    @Override
    double area(){
        double area = 0.5 * base * height;
        System.out.println("Luas:" + area);
        return area;
    }

    @Override
    double circumference(){
        double circumference = base + sideA + sideB;
        System.out.println("Keliling:" + circumference);
        return circumference;
    }

}
