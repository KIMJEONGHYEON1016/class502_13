package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Transporatation trans =Transporatation.BUS;
        Enum<Transporatation> trans2 = trans;

        switch (trans) {
            case BUS :
                System.out.println("버스");
                break;
            case SUBWAY:
                System.out.println("지하철");
                break;
            case TAXI:
                System.out.println("택시");
                break;
        }
    }
}
