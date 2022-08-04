package com.example.gitflowsetup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String getMessage(){
        return "Hello Sanil";
    }


    @GetMapping("/exception")
    public String getException() throws Exception{
        if (true) {
            throw new Exception("this point threw an exception");
        }
        return "Hello Sanil";
    }

}
