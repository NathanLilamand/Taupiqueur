/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taupiqueur.intfgra;

/**
 *
 * @author Marc L
 */
public class Cell {
    boolean taupiqueurcurrent = false;

    public boolean addtaupiqueur () {
        if(!taupiqueurcurrent){
            taupiqueurcurrent = true;
            return true;
        }return false;
    }
    public void deletetaupiqueur () {taupiqueurcurrent = false;}
    public boolean presencetaupiqueur(){return taupiqueurcurrent;}

}
