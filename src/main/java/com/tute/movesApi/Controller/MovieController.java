package com.tute.movesApi.Controller;
import com.tute.movesApi.card.Card;
import com.tute.movesApi.card.Image;
import com.tute.movesApi.service.taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MovieController {
    @Autowired
    private taskService service;

    @PostMapping ("/insert")
    public Card Insert(@RequestBody Card movie)
    {
        return service.saveCard(movie);
    }
    @GetMapping("/movie")
    public List<Card> listAll()
    {
        return service.getProduct();
    }
    @PostMapping("/insertImage")
    public Image InsertImage(@RequestBody Image img)
    {
        return service.saveImage(img);
    }
    @GetMapping("/get")
    public List<Image> InsertImage()
    {
        return service.getImage();
    }
    @GetMapping("/getId")
    public  Integer getId(@RequestParam("title") String title)
    {
        Card x=service.getProductByTitle(title);
        return x.getId();
    }
}
