package MultiThreading.UsingThread;

public class Main {
    public static void main(String[] args) {
        VideoPlayer video = new VideoPlayer();
        video.start();

        SoundPlayer sound = new SoundPlayer();
        sound.start();


    }
}
