package at.htl.demo.diy;

import java.util.HashSet;
import java.util.Set;

public class Product {
    private String name;
    private boolean available;
    private Set<PotentialBuyer> potentialBuyers;

    public Product(String name, boolean available) {
        this.name = name;
        this.available = available;
        this.potentialBuyers = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void update(boolean available) {
        this.available = available;
        this.notifyPotentialBuyers();
    }

    public void subscribe (PotentialBuyer potentialBuyer) {
        this.potentialBuyers.add(potentialBuyer);
    }

    private void notifyPotentialBuyers() {
        this.potentialBuyers.forEach(potentialBuyer -> potentialBuyer.notify(this));
    }

    @Override
    public String toString() {
        return name + "(" + (available ? "verfügbar" : "nicht verfügbar") + ")";
    }
}
