package com.nitin.demo.service2.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 What this program snippet doing?
 **/
@RestController
public class Service2Controller {

    private static final Logger LOGGER = LoggerFactory.getLogger(Service2Controller.class);

    @Autowired
    private RestTemplate restTemplate;


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    @GetMapping("/home")
    public String Service2Home(){
        LOGGER.info("This is Service2 Controller Homepage");
        return "This is Service2 Controller Home page";
    }

    @GetMapping("/serviceTwo")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> getServiceOne(){

        LOGGER.info("I am here in Service2 ");
        return new ResponseEntity<>("I am here in Service2,Success calling Spring Sleuth", HttpStatus.OK);

    }



}
