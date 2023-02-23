public class Square extends FlatFigure {
    double side;

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
