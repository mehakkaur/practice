package com.SpringIn28Minutes.SpringBootWebServicesRestfulin28;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controler+@REsponseBody
public class HelloUserController {

    // Method returning string
    @GetMapping(path="/hellouser")
    public String helloWorld() {
        return "Hello User :)";
    }
    // Method returning a Bean
    @GetMapping(path="/hellouserbean")
    public HelloWorldBean returnHelloWorldBean() {
        return new HelloWorldBean("hello mehak :)");
    }

    // Method returning a Bean with path variable concept
    @GetMapping(path="/hellouserbean/pathvariable/{name}")
    public HelloWorldBean returnHelloWorldBean(@PathVariable("name")String name) {
        return new HelloWorldBean("hello user,"+name);
    }
}
