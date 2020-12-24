/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taupiqueur.intfgra;

import java.util.Random;
import java.util.TimerTask;

/**
 *
 * @author Marc L
 */
public class Timer1 extends TimerTask {
    Grid newGrid;
    //JPanel panelgrid;
    
    Timer1(Grid TheGameGrid /*, JPanel panelgridodthegame */){
        newGrid = TheGameGrid;
        //panelgrid = panelgridodthegame;
    }
    
    private int time = 10;
    private int getTime(){return time;}
    int column, line;
   

    @Override
    public void run() {
        do {
            Random i = new Random();
            Random j = new Random();
            column = i.nextInt(4);
            line = j.nextInt(4);
            newGrid.tab[line][column].addtaupiqueur();
            //panelgrid.repaint();
        }while (newGrid.tab[line][column].addtaupiqueur());
        if (time == 0) {
            cancel();
        }
        time--;
    }
}
