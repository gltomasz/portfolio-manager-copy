package portfolio;

import java.util.List;

interface Repository<T, ID> {
    List<T> findAll();
}
