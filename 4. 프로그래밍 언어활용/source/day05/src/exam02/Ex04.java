package exam02;

public class Ex04 {
    public static void main(String[] args) {
        A ad =  new D();  //D는 A를 상속받음
        A ac = new C();   //C는 A를 상속받음, ac객체는 C 주소를 가리킴

        if (ad instanceof C) {
            C c = (C) ad;
        }

        if (ac instanceof C) {
            C cc = (C) ac;
            System.out.println(cc.numC);
        }
    }
}
