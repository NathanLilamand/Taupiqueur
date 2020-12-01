
import java.util.Random;
import java.util.TimerTask;

public class Timer1 extends TimerTask {
    private int time = 10;
    private int getTime(){return time;}
    int column, line;
    Grid newGrid;

    @Override
    public void run() {
        do {
            Random i = new Random();
            Random j = new Random();
            column = i.nextInt(4);
            line = j.nextInt(4);
            newGrid.tab[line][column].addtaupiqueur();
        }while (newGrid.tab[line][column].addtaupiqueur());
        if (time == 0) {
            cancel();
        }
        time--;
    }


}
