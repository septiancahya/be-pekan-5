public class Square {
    double side;
    public Square(double side){
        this.side = side;
    }

    public double area(){
        return side * side;
    }

    public double circumference(){
        return side * 4;
    }

}
