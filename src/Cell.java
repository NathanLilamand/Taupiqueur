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
