package portfolio

import spock.lang.Specification

class AccountSpec extends Specification {

    def 'account balance is increased after deposit'() {
        given:
            LocalAccount localAccount = aLocalAccount()
        when:
            localAccount.deposit(100.01)
            localAccount.deposit(150.49)
        then:
            localAccount.balance() == 250.50d
    }

    def 'account balance is reduced after withdraw'() {
        given:
            Account anAccount = aLocalAccount(100.50)
        when:
            anAccount.withdraw(50)
        then:
            anAccount.balance() == 50.50d
    }

    private static LocalAccount aLocalAccount(balance = 0.0d) {
        def account = new LocalAccount("PLN account", Currency.PLN)
        account.add(balance)
        return account
    }
}
