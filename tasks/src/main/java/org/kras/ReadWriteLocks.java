package org.kras;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
• locked
• null
• key
• broken
• unlocked
 */

public class ReadWriteLocks {
    public static void main(String[] args) {
        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        Lock rl = rwl.readLock();
        Lock wl = rwl.writeLock();
        String result = null;
        try {
            rl.lock();
            if (wl.tryLock()) {
                result = "locked";
            }
        } catch (Exception e) {
            result = "broken";
        } finally {
            rl.unlock();
            if (rwl.isWriteLocked()) {
                wl.unlock();
                result = "unlocked";
            }
        }
        System.out.println(result);
    }
}
