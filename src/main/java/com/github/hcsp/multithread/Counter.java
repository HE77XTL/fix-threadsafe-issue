package com.github.hcsp.multithread;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private ReentrantLock lock = new ReentrantLock();
    private int value = 0;

    public int getValue() {
        return value;
    }

    // 加上一个整数i，并返回加之后的结果
    public int addAndGet(int i) {
        try{
            lock.lock();
            value += i;
            return value;
        }finally {
            lock.unlock();
        }

    }

    // 减去一个整数i，并返回减之后的结果
    public int minusAndGet(int i) {
        try{
            lock.lock();
            value -= i;
            return value;
        }finally {
            lock.unlock();
        }

    }
}
