public class MainISPBefore {

    public static void main(String[] args) {

        Worker human = new HumanWorker();
        human.work();
        human.eat();

        Worker robot = new RobotWorker();
        robot.work();

        // Provoque une exception à l'exécution
        robot.eat();
    }
}
