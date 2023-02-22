public class Main {
    public static void main(String[] args) {
        System.out.println("Luas dan keliling masing-masing tanah yang dimiliki Pak dengklek yaitu");
        System.out.println("");

        Square dengklekSquare = new Square();
        dengklekSquare.side = 5;
        System.out.println("PERSEGI");
        System.out.println("Luas: "+ dengklekSquare.area());
        System.out.println("Keliling: "+ dengklekSquare.circumference());

        System.out.println("");

        Rectangle dengklekRectangle = new Rectangle();
        dengklekRectangle.length = 10;
        dengklekRectangle.width = 5;
        System.out.println("PERSEGI PANJANG");
        System.out.println("Luas: "+ dengklekRectangle.area());
        System.out.println("Keliling: "+ dengklekRectangle.circumference());

        System.out.println("");

        Triangle dengklekTriangle = new Triangle();
        dengklekTriangle.base = 10;
        dengklekTriangle.height = 7;
        dengklekTriangle.sideA = 9;
        dengklekTriangle.sideB = 8;
        System.out.println("SEGITIGA");
        System.out.println("Luas: "+ dengklekTriangle.area());
        System.out.println("Keliling: "+ dengklekTriangle.circumference());

        System.out.println("");

        Circle denglekCircle = new Circle();
        denglekCircle.radius = 7;
        System.out.println("LINGKARAN");
        System.out.println("Luas: "+ denglekCircle.area());
        System.out.println("Keliling: "+ denglekCircle.circumference());
    }
}