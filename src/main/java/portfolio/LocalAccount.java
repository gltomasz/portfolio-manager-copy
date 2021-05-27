package portfolio;

class LocalAccount extends Account {

    public LocalAccount(String name, Currency currency) {
        super(name, currency);
    }

    public void deposit(double amount) {
        add(amount);
    }
}
