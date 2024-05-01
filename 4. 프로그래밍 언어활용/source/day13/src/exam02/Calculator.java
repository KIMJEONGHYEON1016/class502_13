package exam02;

@FunctionalInterface
// 함수형 인터페이스 함수를 한개만 설정해야함 단일성)
public interface Calculator {
    int add(int num1, int num2);
}
