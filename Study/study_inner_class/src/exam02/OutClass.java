package exam02;

class OutClass {  // 외부 클래스
    private int outNum = 10;     // 외부변수
    private static int staticNum = 20; // 외부 클래스 static 변수


    static class InClass {
        int inNum = 10;        //내부 클래스 멤버 변수
        static int sinNum = 100;  //내부 클래스의 static 변수

        void inMethod() {
            System.out.println(staticNum);      //내부 클래스의 멤버 변수
        }
    }
}
