package com.tute.movesApi.repository;
import com.tute.movesApi.card.Card;
import com.tute.movesApi.card.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepo extends JpaRepository<Card,Integer>
{


    Card findByTitle(String title);
}
