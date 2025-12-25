public class MainLSPBefore {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(4);
        System.out.println("Aire du rectangle : " + rectangle.getArea());

        Rectangle square = new Square();
        square.setWidth(5);
        square.setHeight(4); // Résultat inattendu
        System.out.println("Aire du carré : " + square.getArea());
    }
}
