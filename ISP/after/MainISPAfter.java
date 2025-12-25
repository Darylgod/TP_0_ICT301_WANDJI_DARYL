public class MainISPAfter {

    public static void main(String[] args) {

        Workable human = new HumanWorker();
        human.work();

        Eatable humanEatable = new HumanWorker();
        humanEatable.eat();

        Workable robot = new RobotWorker();
        robot.work();
    }
}
