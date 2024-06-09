package exam01;

class OutClass {  // 외부 클래스
    private int outNum = 10;     // 외부변수

    private InClass inClass;  //멤버 변수로 생성

    public OutClass() {         // 인클래스 객체화
        inClass = new InClass();
    }

    class InClass {
        int inNum = 10;
    }

}
