public class Square extends FlatFigure {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    void type(){
        System.out.println("PERSEGI");
    }

    @Override
    double area(){
        double area = side * side;
        System.out.println("Luas:" + area);
        return area;
    }

    @Override
    double circumference(){
        double circumference = side * 4;
        System.out.println("Keliling:" + circumference);
        return circumference;
    }

}
