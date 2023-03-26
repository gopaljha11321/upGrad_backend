package com.tute.movesApi.repository;

import com.tute.movesApi.card.Card;
import com.tute.movesApi.card.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface imageRepo extends JpaRepository<Image,Integer> {


    Image findByPath(Integer id);
}
