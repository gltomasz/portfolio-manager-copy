package portfolio

import spock.lang.Specification

class WalletFacadeSpec extends Specification {

    WalletFacade walletFacade

    def setup() {
        walletFacade = new WalletConfiguration().walletFacade()
    }

    def 'wallet list contains added wallet'() {
        given:
            Wallet wallet = new Wallet("test wallet")
        when:
            walletFacade.addWallet(wallet)
        then:
            walletFacade.wallets() == [new Wallet("test wallet")]
    }


    def 'wallet list does not contain removed wallet'() {
        given:
            Wallet wallet = new Wallet("test wallet")
        when:
            walletFacade.addWallet(wallet)
        and:
            walletFacade.removeWallet(wallet)
        then:
            walletFacade.wallets().isEmpty()
    }
}
