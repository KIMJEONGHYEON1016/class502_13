package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 100;
        s1.name = "이이름";
        s1.subject = "자바";
        System.out.println(s1.id);
        s1.study();

        Student s2 = new Student();

        s2.id = 1001;
        s2.name = "김이름";
        s2.subject = "자바스크립트";
    }
}
