package at.htl.demo.listener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Observable;

public class Product {
    private String name;
    private boolean available;
    private PropertyChangeSupport support;

    public Product(String name, boolean available) {
        this.name = name;
        this.available = available;
        support = new PropertyChangeSupport(this);
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void update(boolean available) {
        support.firePropertyChange("available", this.available, available);
        this.available = available;
        System.out.printf("Updated Product %s%n", this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    @Override
    public String toString() {
        return name + " (" + (available ? "verfügbar" : "nicht verfügbar") + ")";
    }
}
