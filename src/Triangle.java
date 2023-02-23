public class Triangle extends FlatFigure {
    double height;
    double base;
    double sideA;
    double sideB;

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
