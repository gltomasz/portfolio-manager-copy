package portfolio;

class WalletConfiguration {

    WalletFacade walletFacade() {
        return new WalletFacade(new InMemoryWalletRepository());
    }
}
