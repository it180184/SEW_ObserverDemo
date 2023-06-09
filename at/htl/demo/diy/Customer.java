package at.htl.demo.diy;

public class Customer implements PotentialBuyer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void notify(Product product) {
        System.out.printf("Customer (%s) received Product update for %s %n", name, product);
    }
}
