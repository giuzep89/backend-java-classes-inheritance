public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Giuseppe", "Rinaldi", new MasterCard(400));

        customer.printName();

        Customer customer2 = new Customer("Richard", "Benson", new VisaCard(500));

        customer2.printName();

        customer.getCreditCard().pay(10);

        System.out.println(customer.getCreditCard().getDebt());





    }
}
