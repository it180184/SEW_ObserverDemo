package at.htl.demo.observer;

import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }
    @Override
    public void update(Observable o, Object product) {
        System.out.printf("Customer (%s) received Product update for %s %n", name, product);
    }
}
