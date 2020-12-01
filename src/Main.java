import java.util.Timer;

public class Main extends com.sun.tools.javac.Main {
    public static void main(String args[]) {
        Game newGame = new Game();
        newGame.initialisationGame();
        Timer chrono = new Timer();
        Timer chrn = new Timer();
        chrono.schedule(new Timer1(),0,1000);
        chrn.schedule(new Timer1(),0,2000);

    }

}
