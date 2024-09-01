package MultiThreading.DeadLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {
 }
 class MyThread1 extends Thread{
    Resource res1;
    Resource res2;

    MyThread1(Resource res1,Resource res2){
        this.res1=res1;
        this.res2=res2;
    }
    @Override
    public void run(){
        synchronized (res1){
            System.out.println("Thread 1 has allocated the res1 lock");

            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
            synchronized (res2){
                System.out.println("Thread 1 has allocated res2 lock");
            }
        }
    }
}

class MyThread2 extends Thread{
    Resource res1;
    Resource res2;

    MyThread2(Resource res1,Resource res2){
        this.res1=res1;
        this.res2=res2;
    }
    @Override
    public void run(){
        synchronized (res2){
            System.out.println("Thread 2 has allocated the res2 lock");

            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
            synchronized (res1){
                System.out.println("Thread 2 has allocated res1 lock");
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        Resource res1 = new Resource();
        Resource res2 = new Resource();

        MyThread1 thread1 = new MyThread1(res1,res2);
        thread1.start();
        MyThread2 thread2 = new MyThread2(res1,res2);
        thread2.start();
    }
}
