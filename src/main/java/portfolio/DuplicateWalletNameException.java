package portfolio;

import java.text.MessageFormat;

class DuplicateWalletNameException extends RuntimeException {

    public DuplicateWalletNameException(String walletName) {
        super(MessageFormat.format("Wallet with name {0} already exists", walletName));
    }
}
