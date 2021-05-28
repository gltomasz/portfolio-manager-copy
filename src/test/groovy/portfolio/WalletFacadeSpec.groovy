package portfolio

import spock.lang.Specification

class WalletFacadeSpec extends Specification {

    WalletFacade walletFacade

    def setup() {
        walletFacade = new WalletConfiguration().walletFacade()
    }

    def 'wallet list contains added wallet'() {
        given:
            Wallet wallet = TestFixtures.createWallet()
        when:
            walletFacade.addWallet(wallet)
        then:
            walletFacade.wallets() == [wallet]
    }


    def 'wallet list does not contain removed wallet'() {
        given:
            Wallet wallet = TestFixtures.createWallet()
            walletFacade.addWallet(wallet)
        when:
            walletFacade.removeWallet(wallet)
        then:
            walletFacade.wallets().isEmpty()
    }

    def 'adding wallet with duplicated name throws'() {
        def walletName = "myWallet"
        given:
            Wallet firstWallet = TestFixtures.createWallet(walletName)
            walletFacade.addWallet(firstWallet)
            Wallet secondWallet = TestFixtures.createWallet(walletName)
        when:
            walletFacade.addWallet(secondWallet)
        then:
            thrown(DuplicateWalletNameException)
    }
}
