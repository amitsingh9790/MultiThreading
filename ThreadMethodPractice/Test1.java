package MultiThreading.ThreadMethodPractice;

public class Test1 extends Thread {
    @Override
    public void run(){
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Child");
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}

class Main3 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        System.out.println("isDaemon():"+test.isDaemon());
//        test.setDaemon(true);
//        System.out.println("isDaemon():"+test.isDaemon());
//        System.out.println("CurrentThread:"+test.currentThread());
//        System.out.println("CurrentThread is Alive:"+test.currentThread().isAlive());
//        System.out.println("CurrentThread Name" +test.currentThread().getName());
//        test.currentThread().setName("Amit");
//        System.out.println("CurrentThread Name" +test.currentThread().getName());
//        System.out.println("Get Priority: "+test.getPriority());
//        test.setPriority(8);
//        System.out.println("Get Priority: "+test.getPriority());
//        test.start();
        Test1 test1 = new Test1();
        test1.start();
        try{
            test1.join(); //test1 thread iske katyam hone ka wait karega
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
