public class Grid {
    int tablength = 4;
    int getTablength0 = tablength - 1;
    Cell[][] tab = new Cell[tablength][tablength];

    public Grid() { // fill the boxes with cells
        for (int i = 0; i < getTablength0; i++) {
            for (int y = 0; y < getTablength0; y++) {
                tab[i][y] = new Cell();
            }
        }
    }


}
