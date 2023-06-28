package com.crudboot.springbootcrudapp.dao;

import com.crudboot.springbootcrudapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
