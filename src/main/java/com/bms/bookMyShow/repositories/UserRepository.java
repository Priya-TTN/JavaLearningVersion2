package com.bms.bookMyShow.repositories;

import com.bms.bookMyShow.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    @Override
//    Optional<User> findById(Long userId);
    Optional<User> findByEmail(String email);
//    @Query("SELECT u FROM User u WHERE u.email = :email")
//    List<User> findByEmail(@Param("email") String email);

}