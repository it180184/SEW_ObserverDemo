package at.htl.demo.observer;

import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

public class Product extends Observable {
    private String name;
    private boolean available;

    public Product(String name, boolean available) {
        this.name = name;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void update(boolean available) {
        this.available = available;
        System.out.printf("Updated Product %s%n", this);
        setChanged();
        notifyObservers(this);
    }

    @Override
    public String toString() {
        return name + " (" + (available ? "verfügbar" : "nicht verfügbar") + ")";
    }
}
