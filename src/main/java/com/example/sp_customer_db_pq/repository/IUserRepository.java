package com.example.sp_customer_db_pq.repository;

import com.example.sp_customer_db_pq.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
   User findByUsername(String username);
}
