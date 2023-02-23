public class Main {
    public static void main(String[] args) {
        System.out.println("Luas dan keliling masing-masing tanah yang dimiliki Pak dengklek yaitu");
        System.out.println("");

        Square persegi = new Square();
        persegi.side = 5;
        System.out.println("PERSEGI");
        persegi.area();
        persegi.circumference();

        System.out.println("");

        Rectangle persegiPanjang = new Rectangle();
        persegiPanjang.length = 10;
        persegiPanjang.width = 5;
        System.out.println("PERSEGI PANJANG");
        persegiPanjang.area();
        persegiPanjang.circumference();

        System.out.println("");

        Triangle segitiga = new Triangle();
        segitiga.base = 10;
        segitiga.height = 7;
        segitiga.sideA = 9;
        segitiga.sideB = 8;
        System.out.println("SEGITIGA");
        segitiga.area();
        segitiga.circumference();

        System.out.println("");

        Circle lingkaran = new Circle();
        lingkaran.radius = 7;
        System.out.println("LINGKARAN");
        lingkaran.area();
        lingkaran.circumference();
    }
}