package MultiThreading;

public class NumToPrint implements  Runnable{
    int num;
    NumToPrint(int num){
        this.num=num;
    }
    @Override
    public void run() {
        System.out.println(num+" "+Thread.currentThread().getName());
        num++;
    }
}

class Main{
    public static void main(String[] args) {
        NumToPrint n = new NumToPrint(5);
        for (int i = 1; i < 101; i++) {
            Thread t = new Thread(n);
            t.start();
        }
    }
}
