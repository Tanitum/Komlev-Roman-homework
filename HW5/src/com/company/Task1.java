package com.company;
public class Task1 {

    public static class RunnableThread implements Runnable {
        @Override
        public void run() {
            System.out.println("This is runnable thread");
        }
    }

    public static class ExtendedThread extends Thread {
        @Override
        public void run() {
            System.out.println("This is extended thread");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Thread runnableThread = new Thread(new RunnableThread());
            runnableThread.start();
            ExtendedThread extendedThread = new ExtendedThread();
            extendedThread.start();
        }
    }

}
