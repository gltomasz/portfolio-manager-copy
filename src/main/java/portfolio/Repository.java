package portfolio;

import java.util.List;

interface Repository<T, ID> {
    List<Wallet> findAll();
}
