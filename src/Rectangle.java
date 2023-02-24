public class Rectangle extends FlatFigure {
    double width;
    double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    void type(){
        System.out.println("PERSEGI PANJANG");
    }

    @Override
    double area(){
        double area = width * length;
        System.out.println("Luas:" + area);
        return area;
    }

    @Override
    double circumference(){
        double circumference = (2 * width) + (2 * length);
        System.out.println("Keliling:" + circumference);
        return circumference;
    }

}
