package ru.itis.examples;

/**
 * 07.09.2020
 * 01. Threads
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TirexTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Tirex");
        }
    }
}
