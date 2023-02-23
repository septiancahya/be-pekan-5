public class Circle extends FlatFigure {
    final double phi = 3.14;
    double radius;

    @Override
    double area(){
        double area = phi * (radius * radius);
        System.out.println("Luas:" + area);
        return area;
    }

    @Override
    double circumference(){
        double circumference = 2 * phi * radius;
        System.out.println("Keliling:" + circumference);
        return circumference;
    }

}
