package MultiThreading.Client;

import java.util.Scanner; 

class TableCreater extends Thread {
    int n;
    TableCreater(int n){
        this.n = n;
    }
    @Override
    public void run(){
            for (int i = 1; i < 11 ; i++) {
                System.out.println(n+"*"+i+"="+n*i);
            }
    }
} 

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            TableCreater tableCreater = new TableCreater(i);
            Thread thread = new Thread(tableCreater);
            thread.start();
        }

    }
}
