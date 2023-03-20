package at.htl.demo.diy;

public class Customer extends PotentialBuyer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    void notify(Product product) {
        System.out.printf("Customer (%s) received Product update for %s %n", name, product);
    }
}
