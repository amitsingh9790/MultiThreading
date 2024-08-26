package MultiThreading.Executers;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClassDemo extends Thread{
    @Override
    public void run(){
        for (int i = 1; i < 6; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}

class Main{
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10); // yak time par 10 thread hundle hote hai
        for (int i = 0; i < 101; i++) {
            ClassDemo classDemo = new ClassDemo();
            es.submit(classDemo);
        }
    }
}
