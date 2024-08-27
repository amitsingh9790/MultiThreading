package MultiThreading.TrainEarning;

class TicketEarning extends Thread{
    int ticket_price = 100;
    int total_earning = 0;

    @Override
    public void run(){
        for (int i = 1; i < 11; i++) {
            total_earning = total_earning+ticket_price;
        }
    }
}

public class TrainEarning {
    public static void main(String[] args) throws InterruptedException {
        TicketEarning te = new TicketEarning();
        te.start();

        synchronized (te){
            te.wait();
            System.out.println("Total Earning: "+te.total_earning);
        }
    }
}
