package com.shop.OnlineShop.repositories;

import com.shop.OnlineShop.models.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Users, String> {

}
