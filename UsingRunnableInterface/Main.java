package MultiThreading.UsingRunnableInterface;

public class Main {
    public static void main(String[] args) {
        VideoPlayer v = new VideoPlayer();
        Thread t = new Thread(v);
        t.start();

        SoundPlayer s = new SoundPlayer();
        Thread t2 = new Thread(s);
        t2.start();
    }
}

