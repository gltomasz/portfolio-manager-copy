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
}
