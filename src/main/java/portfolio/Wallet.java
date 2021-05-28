package portfolio;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
class Wallet {

    private final String name;

    public Wallet(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name == null || "".equals(name)) {
            throw new IllegalArgumentException("Wallet name cannot be null or empty");
        }
    }

}
