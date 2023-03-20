package at.htl.demo.listener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Observable;
import java.util.Observer;

public class Customer implements PropertyChangeListener {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.printf("Customer (%s) received Product update to %b %n", name, evt.getNewValue());
    }
}
