package exam02;

public class Ex04 {
    public static void main(String[] args) {
        A ad =  new A();  //D는 A를 상속받음
        A ac = new A();   //C는 A를 상속받음, ac객체는 C 주소를 가리킴

        System.out.println(ad == ac);
        ad.numA = 20;
        System.out.println(System.identityHashCode(ad));
        System.out.println(System.identityHashCode(ac));


        if (ad instanceof C) {
            C c = (C) ad;
        }

        if (ac instanceof C) {
            C cc = (C) ac;
            System.out.println(cc.numC);
        }
    }
}
