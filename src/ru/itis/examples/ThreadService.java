package ru.itis.examples;

/**
 * 07.09.2020
 * 01. Threads
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ThreadService {
    public void submit(Runnable task) {
        Thread taskThread = new Thread(task);
        taskThread.start();
    }
}
