package MultiThreading.UsingRunnableInterface;

public class VideoPlayer implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i < 101; i++) {
            System.out.println(i+" Playing Video");
        }
    }
}

