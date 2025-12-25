public class MainSRPAfter {

    public static void main(String[] args) {

        BookSRP book = new BookSRP(
                "Les principes SOLID",
                "Etudiants M1-GL",
                "Cours sur les principes SOLID"
        );

        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookBusinessLogic logic = new BookBusinessLogic();

        printer.printToScreen(book);
        saver.saveToDatabase(book);
        logic.emprunter(book, "Marcial");
    }
}
