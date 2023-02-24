import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Luas dan keliling masing-masing tanah yang dimiliki Pak dengklek yaitu");
        System.out.println("");

        Square persegi = new Square(5);
        Rectangle persegiPanjang = new Rectangle(5, 10);
        Triangle segitiga = new Triangle(7, 10, 9, 8);
        Circle lingkaran = new Circle(7);
        List<FlatFigure> flatFigureList = List.of(persegi, persegiPanjang, segitiga, lingkaran);
        flatFigureList.forEach(flatFigure -> {
            flatFigure.type();
            flatFigure.area();
            flatFigure.circumference();
            System.out.println("");
        });
    }
}