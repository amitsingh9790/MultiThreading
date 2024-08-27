package MultiThreading.Callable;

import java.util.concurrent.*;

public class ThreadTask implements Callable {
    @Override
    public Object call() throws Exception{
        return "Hello";
    }
}

class Main{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadTask tt  = new ThreadTask();
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future promise = es.submit(tt);
        System.out.println(promise.get());

        es.shutdown();
    }
}