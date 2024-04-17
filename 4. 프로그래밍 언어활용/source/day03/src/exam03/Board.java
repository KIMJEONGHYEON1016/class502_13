package exam03;

import javax.swing.plaf.PanelUI;

public class Board {
    private static Board instance = new Board();
    private Board() {}

    public static Board getInstance() {
        return instance;
    }
}
