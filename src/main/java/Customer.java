public class Customer {
    private String name;
    private String lastName;
    private int customerNumber;
    private CreditCard creditCard;

    public Customer(String name, String lastName, int customerNumber, CreditCard creditCard) {
        this.name = name;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.creditCard = creditCard;
    }

    public Customer(String name, String lastName, CreditCard creditCard) {
        this.name = name;
        this.lastName = lastName;
        this.creditCard = creditCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void printName(){
        System.out.println("Customer: " + name);
    }
}
