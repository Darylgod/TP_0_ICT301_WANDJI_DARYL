public class MainSRPBefore {

    public static void main(String[] args) {

        Book book = new Book(
                "Les principes SOLID",
                "Etudiants M1-GL",
                "Cours sur les principes SOLID"
        );

        book.printToScreen();
        book.saveToDatabase();
        book.emprunter("Marcial");
    }
}
