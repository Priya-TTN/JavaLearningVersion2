package com.bms.bookMyShow.repositories;

import ch.qos.logback.core.subst.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long>  {
    Token save(Token token);

    Optional<com.bms.bookMyShow.models.Token> findByValue(String value);


    Optional<com.bms.bookMyShow.models.Token> findByValueAndDeletedAndExpiryDateGreaterThan(
            String tokenValue,
            Boolean deleted,
            Date currentTime
    );

    com.bms.bookMyShow.models.Token save(com.bms.bookMyShow.models.Token token);
}
