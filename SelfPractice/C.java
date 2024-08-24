package MultiThreading.SelfPractice;

public class C extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"  class Successfully executed");
    }
}

class Main{
    public static void main(String[] args) {
        C c = new C();
        c.start();
    }
}