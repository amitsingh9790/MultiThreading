package MultiThreading.ThreadMethodPractice;

public class Test implements Runnable {
    Thread t;

    Test(Thread t) {
        this.t = t;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        Thread mainthread = Thread.currentThread();
        Test test = new Test(mainthread);
        Thread thread = new Thread(test);
        thread.start();
        try {
            thread.join(); //jo thread us line ko execute kara raha hai wo wait karega
            for (int i = 1; i < 6; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}