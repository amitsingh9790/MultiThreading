package MultiThreading.SelfPractice;

public class D implements Runnable{
    @Override
    public void run(){
        System.out.println("Priority: "+Thread.currentThread().getPriority()+" "+Thread.currentThread().getName()+" class Successfully executed");
    }
}

class Main2{
    /**
     * The Main function
     */
    public static void main(String[] args) {
        D d = new D();
        Thread t = new Thread(d); // Created a new thread using the D instance
        t.setName("D Thread");
        System.out.println("Priority: of "+t.getName()+" is :"+t.getPriority());
        t.setPriority(2);
        t.start(); // Thread has started to execute the run() method

        D d1 = new D();
        Thread t1 = new Thread(d1);
        t1.setName("D1 Thread");
        System.out.println("Priority: of "+t1.getName()+" is :"+t1.getPriority());
        t1.setPriority(8);
        t1.start();
    }
}
