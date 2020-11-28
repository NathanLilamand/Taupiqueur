public class Cell {
    boolean taupiqueurcurrent = false;

    public void addtaupiqueur () {taupiqueurcurrent = true;}
    public void deletetaupiqueur () {taupiqueurcurrent = false;}
    public boolean presencetaupiqueur(){return taupiqueurcurrent;}


}
