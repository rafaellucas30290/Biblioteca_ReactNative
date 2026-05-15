package Biblioteca.api.br.API.Biblioteca.controller;

import Biblioteca.api.br.API.Biblioteca.entity.User;
import Biblioteca.api.br.API.Biblioteca.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private userService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> listAll(){
        return userService.listAll();
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id){
        userService.deleteById(id);
    }

    @PatchMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User update(@RequestBody User user){
        return userService.update(user);
    }



}
