package com.ilomultimedia.app_security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path = "/acounts")
public class AcountsController {

    @GetMapping
    public Map<String, String> acounts(){

        //... business logic
        return Collections.singletonMap("msj","acounts");
    }

}
