package MultiThreading.ThreadMethodPractice;

public class MyThread extends Thread{
    public void run(){
        try{
            for (int i = 1; i < 6; i++) {
                System.out.println("Hi"+i);
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
        try{
            for (int i = 1; i < 6; i++) {
                System.out.println("Hello"+i);
                Thread.sleep(1000);

            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

class Main4{
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();
        myThread.interrupt(); // yak baar is interrupt karta hai
        System.out.println(myThread.isInterrupted());
    }
}