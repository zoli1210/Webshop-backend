package webshopApp.repository;

import webshopApp.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByUserName(String userName);
    User findByEmail(String email);
}

