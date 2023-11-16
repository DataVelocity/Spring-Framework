
package net.javaguides.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import net.javaguides.springboot.entity.User;

@EnableMongoRepositories
public interface UserRepository extends MongoRepository<User, Long> {
}








//
//package net.javaguides.springboot.repository;
//
//import net.javaguides.springboot.entity.User;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface UserRepository extends JpaRepository<User, Long> {
//}
