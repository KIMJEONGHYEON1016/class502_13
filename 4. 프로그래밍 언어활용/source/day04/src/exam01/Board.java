package exam01;

public class Board {
//    private static Board instance = new Board();           //클래스 로드 시점부터 객체

    private static Board instance;       //인스턴스를 껍데기만 정의함 (실제 정의x)

    private Board() {}   //객체를 외부에서 생성할 수 없게끔함

    public static Board getInstance() {       //껍데기였던정의를 외부말고 내부에서 생성하게끔 함.
        if (instance == null) {
            instance = new Board();
        }
        return instance;
    }
}
