package MultiThreading.ReentrentLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyThread1 extends Thread{
    BookTickets bt;
    int seats;

    public MyThread1(BookTickets bt, int seats) {
        this.bt = bt;
        this.seats = seats;
    }

    @Override
    public void run(){
        try{
            bt.bookTickets(seats);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class MyThread2 extends Thread{
    BookTickets bt;
    int seats;

    public MyThread2(BookTickets bt, int seats) {
        this.bt = bt;
        this.seats = seats;
    }

    @Override
    public void run(){
        try{
            bt.bookTickets(seats);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

 class BookTickets {

    int total_seats=10;
     Lock lock = new ReentrantLock();
    void bookTickets(int seats) throws InterruptedException{
        lock.lock();
        if(total_seats>=seats){
            System.out.println("Success");
            total_seats = total_seats -seats;
            System.out.println("seats left: "+ total_seats);
        }
        else {
            System.out.println("fail");
        }
        Thread.sleep(1000);
        lock.unlock();
    }


}

class Main{
    public static void main(String[] args) {
        BookTickets bt1 = new BookTickets();
        MyThread1 mt1 = new MyThread1(bt1,5);
        mt1.start();

        BookTickets bt2 = new BookTickets();
        MyThread1 mt2 = new MyThread1(bt2,9);
        mt2.start();

    }
}