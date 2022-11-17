public class Polymorphism {

    public static void main(String[] args) {

        Robot myRobot = new Robot();
        myRobot.automate();

        WallE myWallE = new WallE();
        myWallE.automate();

        Terminator myTerminator = new Terminator();
        myTerminator.automate();
    }
}