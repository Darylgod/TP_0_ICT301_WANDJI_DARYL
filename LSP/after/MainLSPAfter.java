public class MainLSPAfter {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(5, 4);
        Shape square = new Square(4);

        System.out.println("Aire du rectangle : " + rectangle.getArea());
        System.out.println("Aire du carré : " + square.getArea());
    }
}
