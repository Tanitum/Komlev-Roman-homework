package com.company;
import java.util.List;

public class Game
{
    public static void main(String[] args) throws InterruptedException
    {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread
    {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = List.of("Начало игры", "Сбор ресурсов", "Рост экономики", "Убийство врагов");

        protected Gamer gamer1 = new Gamer("Player 1", 3);
        protected Gamer gamer2 = new Gamer("Player 2", 1);
        protected Gamer gamer3 = new Gamer("Player 3", 5);

        public void run()
        {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound)
            {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread
    {
        private int rating;

        public Gamer(String name, int rating)
        {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            if (!isInterrupted()) {
                for (String step : OnlineGame.steps) {
                    if (!isInterrupted()) {
                        try {
                            Thread.sleep(1000 / rating);
                        } catch (InterruptedException e) {
                            break;
                        }
                        if (!isInterrupted()){
                            System.out.println(this.getName()+":"+step);
                        }
                    }
                }
            }

            if (!OnlineGame.isWinnerFound && !isInterrupted()){
                OnlineGame.isWinnerFound = true;
                System.out.println(this.getName()+":победитель!");
            } else {
                System.out.println(this.getName()+":проиграл");
            }
        }

    }
}