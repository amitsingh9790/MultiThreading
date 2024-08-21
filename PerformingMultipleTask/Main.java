package MultiThreading.PerformingMultipleTask;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Thread t1 = new Thread(task1);
        t1.start();
        Task2 task2 = new Task2();
        Thread t2 = new Thread(task2);
        t2.start();
        Thread t3 = new Thread(t2);
        t3.start();
        Thread t4 = new Thread(t2);
        t4.start();
    }
}
