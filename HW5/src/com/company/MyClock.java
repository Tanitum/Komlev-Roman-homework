package com.company;

public class MyClock extends Thread{

    public void run() {
        Thread current = Thread.currentThread();
        boolean tik = true;
        while (!current.isInterrupted()) {
            try {
                Thread.sleep(500); // 0,5 секунды
            } catch (InterruptedException e) {
                System.out.println("Работа потока была прервана");
                break;
            }
            if (tik==true){
                System.out.println("Tik");
                tik=false;
            }
            else {
                System.out.println("Tak");
                tik=true;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyClock clock = new MyClock();
        clock.start();
        Thread.sleep(5000); // 5 секунд
        clock.interrupt();
    }

}
