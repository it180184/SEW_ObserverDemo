package at.htl.demo;

import static at.htl.demo.util.Utils.printEnd;
import static at.htl.demo.util.Utils.printStart;

public class Main {

    public static void main(String[] args) {
        startDiyTest();
        startObserverTest();
        startListenerTest();
    }

    private static void startDiyTest() {
        printStart("DIY");
        var store = new at.htl.demo.diy.Store();

        var product1 = new at.htl.demo.diy.Product("Lenovo SuperBook", false);
        var product2 = new at.htl.demo.diy.Product("MacBook Super Ultra +++", false);
        store.addProduct(product1);
        store.addProduct(product2);

        var customer1 = new at.htl.demo.diy.Customer("Max");
        var customer2 = new at.htl.demo.diy.Customer("Susi");
        var customer3 = new at.htl.demo.diy.Customer("Peter");

        product1.subscribe(customer1);
        product1.subscribe(customer2);
        product2.subscribe(customer3);

        product1.update(true);
        printEnd();
    }

    private static void startObserverTest() {
        printStart("Observer");
        var store = new at.htl.demo.observer.Store();

        var product1 = new at.htl.demo.observer.Product("Lenovo SuperBook", false);
        var product2 = new at.htl.demo.observer.Product("MacBook Super Ultra +++", false);
        store.addProduct(product1);
        store.addProduct(product2);

        var customer1 = new at.htl.demo.observer.Customer("Max");
        var customer2 = new at.htl.demo.observer.Customer("Susi");
        var customer3 = new at.htl.demo.observer.Customer("Peter");

        product1.addObserver(customer1);
        product1.addObserver(customer2);
        product2.addObserver(customer3);

        product1.update(true);
        printEnd();
    }

    private static void startListenerTest() {
        printStart("Listener");
        var store = new at.htl.demo.listener.Store();

        var product1 = new at.htl.demo.listener.Product("Lenovo SuperBook", false);
        var product2 = new at.htl.demo.listener.Product("MacBook Super Ultra +++", false);
        store.addProduct(product1);
        store.addProduct(product2);

        var customer1 = new at.htl.demo.listener.Customer("Max");
        var customer2 = new at.htl.demo.listener.Customer("Susi");
        var customer3 = new at.htl.demo.listener.Customer("Peter");

        product1.addPropertyChangeListener(customer1);
        product1.addPropertyChangeListener(customer2);
        product2.addPropertyChangeListener(customer3);

        product1.update(true);
        printEnd();
    }
}
