package exam01;

public class Board {
//    private static Board instance = new Board();           //클래스 로드 시점부터 객체

    private static Board instance;

    private Board() {}

    public static Board getInstance() {
        if (instance == null) {
            instance = new Board();
        }
        return instance;
    }
}
