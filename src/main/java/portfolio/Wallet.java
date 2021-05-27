package portfolio;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
class Wallet {

    private final String name;

    public Wallet(String name) {
        this.name = name;
    }
}
