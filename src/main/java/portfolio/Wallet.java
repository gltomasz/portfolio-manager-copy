package portfolio;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@EqualsAndHashCode
class Wallet {

    private final String name;
    private final List<Account> accounts;

    Wallet(String name) {
        validateName(name);
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    private void validateName(String name) {
        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException("Wallet name cannot be null or empty");
        }
    }

    public String name() {
        return name;
    }

    public List<Account> accounts() {
        return Collections.unmodifiableList(accounts);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }
}
