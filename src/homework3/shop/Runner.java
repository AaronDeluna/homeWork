package homework3.shop;

public class Runner {
    public static void main(String[] args) {
        Shop shop = new Shop(true, false, 2);
        Customer customer = new Customer("Антон");
        customer.checkShop(shop);
    }
}