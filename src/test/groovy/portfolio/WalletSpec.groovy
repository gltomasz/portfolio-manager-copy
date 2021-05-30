package portfolio

import spock.lang.Specification

class WalletSpec extends Specification {

    def 'creating wallet with null or empty name throws'(String name) {
        when:
            new Wallet(name)
        then:
            thrown(IllegalArgumentException)
        where:
            name | _
            null | _
            ""   | _
    }

    def 'add an account'() {
        given:
            Wallet wallet = TestFixtures.createWallet()
            Account account = new LocalAccount("test", Currency.PLN)
        when:
            wallet.addAccount(account)
        then:
            wallet.accounts() == [account]
    }

    def 'remove an account'() {
        given:
            Wallet wallet = TestFixtures.createWallet()
            Account account = new LocalAccount("test", Currency.PLN)
            wallet.addAccount(account)
        when:
            wallet.removeAccount(account)
        then:
            wallet.accounts().isEmpty()
    }
}
