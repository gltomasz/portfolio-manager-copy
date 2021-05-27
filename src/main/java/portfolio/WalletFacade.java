package portfolio;

import java.util.List;

public class WalletFacade {

    private final WalletRepository walletRepository;

    public WalletFacade(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public List<Wallet> wallets() {
        return walletRepository.findAll();
    }

    public void addWallet(Wallet wallet) {
        walletRepository.add(wallet);
    }

    public void removeWallet(Wallet wallet) {
        walletRepository.remove(wallet);
    }
}
