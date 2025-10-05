package edu.prydatkin.websecurity.student;

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
public interface StudentRepository extends MongoRepository<Student, String> {
}
