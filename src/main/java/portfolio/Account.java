package portfolio;

import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode
abstract class Account {

    private final String name;
    private final Currency currency;
    private BigDecimal balance;

    public Account(String name, Currency currency) {
        this.name = name;
        this.currency = currency;
        this.balance = BigDecimal.ZERO;
    }

    protected void add(double amount) {
        balance = balance.add(BigDecimal.valueOf(amount));
    }

    double balance() {
        return balance.doubleValue();
    }

    public void withdraw(double amount) {
        BigDecimal balanceAfterSubtract = balance.subtract(BigDecimal.valueOf(amount));
        balanceShouldNoBeNegative(balanceAfterSubtract);
        balance = balanceAfterSubtract;
    }

    private void balanceShouldNoBeNegative(BigDecimal subtract) {
        if (subtract.doubleValue() < 0) {
            throw new NegativeBalanceException();
        }
    }
}
