package org.kras;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AppStore {
    public static void main(String[] args) {
        Software s = new Game("Chess", 2);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("game.ser"))) {
            out.writeObject(s);
        } catch (Exception e) {
            System.out.println("write error");
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("game.ser"))) {
            Object o = in.readObject();
            s = (Software) o;
        } catch (Exception e) {
            System.out.println("read error");
        }

        System.out.println(s);
    }
}