package MultiThreading.TrainReservation;

class My_Thread extends Thread{
    BookTrainSeat bts;
    int seats;

    My_Thread(BookTrainSeat bts, int seats){
        this.bts = bts;
        this.seats = seats;
    }
    @Override
    public void run(){
        bts.bookSeat(seats);
    }
}

class BookTrainSeat{
    int total_seat = 10;

    synchronized void bookSeat(int seats){
        if(total_seat>=seats) {
            System.out.println(Thread.currentThread().getName()+ " Seats booked Successfully");
            total_seat = total_seat - seats;
            System.out.println("seats left: " + total_seat);
        }
        else {
            System.err.println("Sorry "+Thread.currentThread().getName()+" "+ total_seat +" left only");
        }
    }
}

public class TrainReservation {
    public static void main(String[] args) {
        BookTrainSeat bts = new BookTrainSeat();

        My_Thread amit = new My_Thread(bts,5);
        amit.setName("Amit");
        amit.start();

        My_Thread rahul = new My_Thread(bts,3);
        rahul.setName("Rahul");
        rahul.start();

        My_Thread Ajay = new My_Thread(bts,4);
        Ajay.setName("Ajay");
        Ajay.start();

    }
}