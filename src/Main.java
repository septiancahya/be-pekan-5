public class Main {
    public static void main(String[] args) {
        System.out.println("Luas dan keliling masing-masing tanah yang dimiliki Pak dengklek yaitu");
        System.out.println("");

        Square dengklekSquare = new Square(5);
        System.out.println("PERSEGI");
        System.out.println("Luas: "+ dengklekSquare.area());
        System.out.println("Keliling: "+ dengklekSquare.circumference());

        System.out.println("");

        Rectangle dengklekRectangle = new Rectangle(5, 10);
        System.out.println("PERSEGI PANJANG");
        System.out.println("Luas: "+ dengklekRectangle.area());
        System.out.println("Keliling: "+ dengklekRectangle.circumference());

        System.out.println("");

        Triangle denglekTriangle = new Triangle(7, 10, 9, 8);
        System.out.println("SEGITIGA");
        System.out.println("Luas: "+ denglekTriangle.area());
        System.out.println("Keliling: "+ denglekTriangle.circumference());

        System.out.println("");

        Circle denglekCircle = new Circle(7);
        System.out.println("LINGKARAN");
        System.out.println("Luas: "+ denglekCircle.area());
        System.out.println("Keliling: "+ denglekCircle.circumference());
    }
}