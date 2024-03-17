package com.github.jenkin.docker.integration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

    @GetMapping("/message")
    public String display(){
        return "You have successfully deployed your docker image into K8S !!!";
    }
}
