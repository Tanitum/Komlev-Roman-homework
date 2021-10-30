package com.company;
public final class SingletonTask
{
    private static SingletonTask instance;
    String value;

    private SingletonTask(String value)
    {
        // Этот код эмулирует медленную инициализацию
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        this.value = value;
    }

    static SingletonTask getInstance(String value)
    {
        if (instance == null)
        {
            synchronized(SingletonTask.class){
            instance = new SingletonTask(value);
            }
        }
        return instance;
    }
}