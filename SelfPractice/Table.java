package MultiThreading.SelfPractice;

import MultiThreading.ThreadMethodPractice.MyThread;

public class Table{
    //Synchronized method
    synchronized void printTable(int n){
        for (int i = 1; i < 11; i++) {
            System.out.println(n*i);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    void printTable2(int n){
        //synchronized block
        synchronized (this){
            for (int i = 1; i < 11; i++) {
                System.out.println(n*i);
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread1 extends Thread{
    Table t ;
    MyThread1(Table t){
        this.t= t;
    }
    @Override
    public void run(){
        t.printTable(10);
    }
}
class MyThread2 extends Thread{
    Table t ;
    MyThread2(Table t){
        this.t=t;
    }
    @Override
    public void run(){
        t.printTable2(10);
    }
}

class TestSynchronization{
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}