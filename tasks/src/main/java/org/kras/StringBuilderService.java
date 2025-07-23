package org.kras;

import com.trasnport.vehicle.cars.Car;

import java.util.ServiceLoader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StringBuilderService {
    public static void main(String[] args) {
        ServiceLoader<Car> loader = ServiceLoader.load(Car.class);
        for (Car c : loader) {
            System.out.println(c.getClass().getSimpleName() + " - Car speed: " + c.getSpeed());
        }
        StringBuilder txt = new StringBuilder();
        Runnable r = () -> {
            for (int i = 0; i < 5; i++) {
                synchronized (txt) {
                    txt.append(i);
                }
            }
        };

        Thread t1 = new Thread(r, "T1");
        Thread t2 = new Thread(r, "T2");

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<?> f1 = es.submit(t1);
        Future<?> f2 = es.submit(t2);
        es.shutdown();

        try {
            Object o = f1.get();
            Object o1 = f2.get();
            System.out.println(txt);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
