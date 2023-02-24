public class Circle extends FlatFigure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void type(){
        System.out.println("LINGKARAN");
    }

    @Override
    double area(){
        double area = Math.PI * (radius * radius);
        System.out.println("Luas:" + area);
        return area;
    }

    @Override
    double circumference(){
        double circumference = 2 * Math.PI * radius;
        System.out.println("Keliling:" + circumference);
        return circumference;
    }

}
