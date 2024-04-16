package exam01;

public class Student {
    int id; // 학번
    String name; // 이름
    String subject; // 과목

    public Student(int _id, String _name, String _subject) { // 기본 생성자(Default 생성자)
        id = _id;
        name = _name;
        subject = _subject;

    }

    public Student() { // 생성자 오버로드
        int id;
        String name ;
        String subject;

    }

    void study() {
        // 1) 객체 생성 2) 호출 - 호출 시점에는 인스턴스 변수가 이미 공간 할당
        System.out.printf("학번:%d, %s가 %s를 공부한다.%n", id, name, subject);

    }
}