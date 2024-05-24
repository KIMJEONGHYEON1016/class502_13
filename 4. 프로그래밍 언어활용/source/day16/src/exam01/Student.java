package exam01;

public class Student {
    public int ban;
    private String name;
    private int score;

    public  Student() {};
    public Student(int ban, String name, int score) {
        this.ban = ban;
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ban=" + ban +
                ", name='" + name + '\'' +
                '}';
    }

    public int getBan() {
        return ban;
    }

    public String getName() {
        return name;
    }
}
