package com.tute.movesApi.repository;
import com.tute.movesApi.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
public interface userRepo extends JpaRepository<Card,Integer>
{

}
