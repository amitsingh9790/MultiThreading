package MultiThreading.ThreadMethodPractice;

class TakeAdmission extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("Admission Started");
            Thread.sleep(1000);
            System.out.println("You have taken the Admission successfully");
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

class DepositFee extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("Depositing Fee ");
            Thread.sleep(2000);
            System.out.println("You have taken the Deposited successfully");
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

class TakeRollno extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("Take roll no");
            Thread.sleep(2000);
            System.out.println("Now you got rollno successfully");
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

class Main{
    public static void main(String[] args) throws InterruptedException {
        TakeAdmission t1 = new TakeAdmission();
        t1.start();
        t1.join(); //t1 ke katyam hone ka wait kar raha hai main function

        DepositFee t2 = new DepositFee();
        t2.start();
        t2.join(); //t2 ke katyam hone ka wait kar raha hai main function


        TakeRollno t3 = new TakeRollno();
        t3.start();

    }
}