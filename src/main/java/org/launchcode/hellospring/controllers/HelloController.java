package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // Handles request at root.
    @ResponseBody
    @GetMapping
    public String helloRoot() {

        return "Hello, root!";

    }

    // Handles request at /hello.
    @ResponseBody
    @GetMapping("hello")
    public String helloHello() {

        return "Hello, Spring @ /hello!!";

    }

    // Handles request at /goodbye.
    @ResponseBody
    @GetMapping("goodbye")
    public String goodbye() {

        return "Goodbye, Spring @ /goodbye!";

    }

//    // Handles request at /goodbyepost. NOT WORKING!
//    @PostMapping("goodbyepost")
//    @ResponseBody
//    public String goodbyePost() {
//
//        return "Goodbye, Spring @ /goodbyepost!";
//
//    }

}
