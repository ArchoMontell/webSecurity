package edu.prydatkin.websecurity.item;

/*
    @author lilbl
    @project webSecurity
    @class ItemRepository
    @version 1.0.0
    @since 10/2/2025 - 23.43
*/

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
}
