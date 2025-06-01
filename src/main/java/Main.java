public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Giuseppe", "Rinaldi", new MasterCard(500));

        customer.printName();

        Customer customer2 = new Customer("Richard", "Benson", new VisaCard(500));

        customer2.printName();

        customer.getCreditCard().pay(20);

        customer2.getCreditCard().pay(20);

        System.out.println(customer.getCreditCard().getDebt());

        System.out.println(customer2.getCreditCard().getDebt());

    }
}
