/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taupiqueur.intfgra;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Marc L
 */
public class CellGraph extends JButton{
    Cell associatecell;
    ImageIcon imgempty = new javax.swing.ImageIcon(getClass().getResource("/images/terreminecraft.jpg"));
    ImageIcon imgfull = new javax.swing.ImageIcon(getClass().getResource("/images/taupiqueur.png"));

    public CellGraph (Cell acell){
        associatecell = acell;
    }
    
    @Override
    public void paintComponent (Graphics G) {
        super.paintComponent(G);
        if (associatecell.presencetaupiqueur()){
            setIcon(imgfull);
        }
        else {
        setIcon(imgempty);
        }
    }   
    
}
