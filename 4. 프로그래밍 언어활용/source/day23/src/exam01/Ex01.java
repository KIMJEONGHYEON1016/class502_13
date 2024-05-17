package exam01;

public class Ex01 {
    public static void main(String[] args) { // 메인쓰레드
          Runnable r = () -> {
              for (int i = 0; i < 5; i++) {
                  System.out.println("쓰레드2-" + i);
              }
    };

          Ex01_1 th1 = new Ex01_1();
          Thread th2 = new Thread(r);

          th1.run();
          th2.run();
    }
}

class Ex01_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("쓰레드1-" + i);
        }
    }
}
