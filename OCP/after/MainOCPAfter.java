public class MainOCPAfter {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(4, 3);
        Shape circle = new Circle(5);

        System.out.println("Aire du rectangle : " + rectangle.calculateArea());
        System.out.println("Aire du cercle : " + circle.calculateArea());
    }
}
