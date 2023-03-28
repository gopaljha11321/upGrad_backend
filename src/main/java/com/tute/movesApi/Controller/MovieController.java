package com.tute.movesApi.Controller;
import com.tute.movesApi.card.Card;
import com.tute.movesApi.card.Image;
import com.tute.movesApi.card.User;
import com.tute.movesApi.perameter.Response;
import com.tute.movesApi.perameter.login;
import com.tute.movesApi.service.taskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*" )
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
    @PostMapping("/login")
    public Response login(@RequestBody() login email)
    {
        User user =service.login(email.getEmail());
        Response res=new Response();
        if(user ==null)
        {
            res.setRes_code(0);
            res.setError("Access is denied");
            return res;
        }
        else {
            if(user.getPassword()== email.getPassword()) {
                res.setError("Please enter correct password");
                res.setRes_code(0);
                return res;
            }
            else {
                res.setId(user.getEmail());
                res.setRes_code(1);
            }
        }
        return res;
    }

    @PostMapping("/register")
    public Response RegisterResponse(@RequestBody() User req)
    {
        Response res=new Response();
        User user= service.login(req.getEmail());
        if(user==null)
        {
            service.register(req);
            res.setRes_code(1);
            return res;
        }
        else {
            res.setRes_code(1);
            res.setError("Email already in use");
            return(res);

        }
    }
}
