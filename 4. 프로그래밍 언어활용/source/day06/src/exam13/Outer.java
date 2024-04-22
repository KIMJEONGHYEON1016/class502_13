package exam13;

public class Outer {

    public Calculator method(int num3) {   //데이터 영역에 num3이 할당됨(상수)   인터페이스 Calculator를 통해 만들 객체의 주소
        Calculator cal = new Calculator() {              //객체 생성 근데 명확하지 않아서 {} 로 명확하게 만듬
            public int add(int num1, int num2) {             // 명확한 함수 구현 이 행위를 함으로써 객체가 생성될 조건 완성
                return num1 + num2 + num3;                 // 반환
            }
        };

        return cal;   //객체의 주소를 반환함
    }
}

