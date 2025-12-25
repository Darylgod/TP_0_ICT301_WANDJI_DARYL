public class MainOCPBefore {

    public static void main(String[] args) {

        AreaCalculator calculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle(4, 3);
        Circle circle = new Circle(5);

        System.out.println("Aire du rectangle : " + calculator.calculateArea(rectangle));
        System.out.println("Aire du cercle : " + calculator.calculateArea(circle));
    }
}
