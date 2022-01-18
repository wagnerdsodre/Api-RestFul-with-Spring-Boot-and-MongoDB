package com.wagnersodre.apirestmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wagnersodre.apirestmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
