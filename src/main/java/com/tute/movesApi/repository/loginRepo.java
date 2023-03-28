package com.tute.movesApi.repository;

import com.tute.movesApi.card.User;
import com.tute.movesApi.perameter.login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface loginRepo  extends JpaRepository<User,Integer> {


    User findByEmail(String email);
}
