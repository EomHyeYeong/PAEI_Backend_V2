package com.example.paei_be.repository;

import com.example.paei_be.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
