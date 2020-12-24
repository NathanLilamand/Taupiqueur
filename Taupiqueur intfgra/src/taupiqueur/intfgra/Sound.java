/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taupiqueur.intfgra;

import java.io.File;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


/**
 *
 * @author Marc L
 */
public class Sound {
    
    public void playMusic (String file) {
        
        try
        {
            File filepath = new File(file);
            
            if (filepath.exists()){
                
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(filepath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                
                JOptionPane.showMessageDialog(null, "Press OK to stop playing");
            }
            else {
                System.out.println("Can't find the file");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
            
        }
    }
    
}
