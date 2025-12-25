public class MainDIPAfter {

    public static void main(String[] args) {

        Database mysql = new MySQLDatabase();
        OrderProcessor order1 = new OrderProcessor(mysql);
        order1.processOrder("Commande vers MySQL");

        Database mongo = new MongoDBDatabase();
        OrderProcessor order2 = new OrderProcessor(mongo);
        order2.processOrder("Commande vers MongoDB");
    }
}
