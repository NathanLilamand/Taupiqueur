/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taupiqueur.intfgra;

import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Marc L
 */
public class WindowsGame extends javax.swing.JFrame {

    /**
     * Creates new form WindowsGame
     */
    Grid newGrid = new Grid();
    Sound musicObject = new Sound();
    
    public WindowsGame() {
        initComponents();
        
        for (int i=newGrid.getTablength0; i>=0; i--){
            for (int j=0; j<=newGrid.getTablength0; j++){
                 CellGraph graphiccell = new CellGraph(newGrid.tab[i][j]);
                 panelgrid.add(graphiccell);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelgrid = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelgrid.setBackground(new java.awt.Color(255, 255, 255));
        panelgrid.setLayout(new java.awt.GridLayout(4, 4));
        getContentPane().add(panelgrid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 384, 384));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, -1, -1));

        setBounds(0, 0, 714, 437);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // initialisation of the game
        //String filepath = "sound/etris-remix.wav";
        //musicObject.playMusic(filepath);
        
        // round 1 (wait 12 second before start the game)
        
        Timer chrono = new Timer();
        chrono.schedule(new Timer1(newGrid), 12000, 3000);
        Timer refresh = new Timer();
        refresh.schedule(new TimerTask() {
            @Override
            public void run() {
                panelgrid.repaint();
            }
        }, 3000);
        // round 2 (wait 38 second )
       
        Timer chrono2 = new Timer();
        chrono2.schedule(new Timer1(newGrid), 38000, 2000);
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WindowsGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowsGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowsGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowsGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowsGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panelgrid;
    // End of variables declaration//GEN-END:variables
}
