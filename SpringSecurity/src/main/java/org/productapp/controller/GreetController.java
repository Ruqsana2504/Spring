package org.productapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GreetController {

    //username=user, password is auto generated one by spring
    @GetMapping("/greet/{username}")
    public String greetMessage(@PathVariable String username) {
        return "Great Day : " + username;
    }

    @GetMapping("/show-books")
    public List<String> showBooks() {
        return List.of("Java", "Angular", "React");
    }


}
