package com.tute.movesApi.service;

import com.tute.movesApi.card.Card;
import com.tute.movesApi.card.Image;
import com.tute.movesApi.repository.imageRepo;
import com.tute.movesApi.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class taskService {
    @Autowired
    private userRepo repo;
    @Autowired
    private imageRepo repoImg;

    public Image saveImage(Image img)
    {
        return repoImg.save(img);
    }

    public Card getProductByTitle(String title)
    {
        return repo.findByTitle(title);
    }
    public List<Image> getImage()
    {
        return repoImg.findAll();
    }
    public Card saveCard(Card movie)
    {
        return repo.save(movie);
    }
    public List<Card> saveCards(List<Card> movie)
    {
        return repo.saveAll(movie);
    }

    public List<Card> getProduct()
    {
        return repo.findAll();
    }
    public String deleteCard(int id)
    {
        repo.deleteAll();
        return "product remove !!"+id;
    }
    public Card updateProduct(Card movie)
    {
        Card old=repo.findById(movie.getId()).orElse(null);
        old.setTitle(movie.getTitle());
        return repo.save(old);
    }
}
