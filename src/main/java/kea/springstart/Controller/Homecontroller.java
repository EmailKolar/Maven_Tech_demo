package kea.springstart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {


    @GetMapping("/")
    public String home(){
        return "hello world";
    }

}
