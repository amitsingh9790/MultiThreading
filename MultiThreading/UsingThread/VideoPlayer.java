package MultiThreading.UsingThread;

public class VideoPlayer extends Thread{
    @Override
    public void run(){
        for (int i = 1; i < 101; i++) {
            System.out.println(i+" Playing Video");
        }
    }
}
