package com.itfbgroup.ivanovii.bookLibrary.controller;

import com.itfbgroup.ivanovii.bookLibrary.model.Book;
import com.itfbgroup.ivanovii.bookLibrary.repository.UserRepository;
import com.itfbgroup.ivanovii.bookLibrary.model.Users;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ivanov Ivan
 */
@RestController
public class CommonController{
    private final UserRepository repository;

    public CommonController(UserRepository repository) {
            this.repository = repository;
        }

    @GetMapping("/users")
    List<Users> all() {
        return repository.findAll();
    }

    @GetMapping("/user/{id}")
    Users one(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new UsernameNotFoundException(id.toString()));
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody Users user){
        repository.save(user);
    }

    @PutMapping("/user/{id}")
    public Users modifyBook(@RequestBody Users modifiedUser, @PathVariable Long id){
        return repository.findById(id)
                .map(user -> {
                    user.setUsername(modifiedUser.getUsername());
                    user.setPassword(modifiedUser.getPassword());
                    return repository.save(user);
                }).orElseThrow(()->new IllegalArgumentException());
    };

    @GetMapping("/about")
    public String userDetails(){
        String username;
        String role = "";
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            username = ((UserDetails)principal).getUsername();
            role = ((UserDetails)principal).getAuthorities().toString();
        } else {
            return "Пользователь не авторизован";
        }
        return "Пользователь: "+username+"; Роли: "+role;
    }
}
