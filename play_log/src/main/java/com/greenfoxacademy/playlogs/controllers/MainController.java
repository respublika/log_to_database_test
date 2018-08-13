package com.greenfoxacademy.playlogs.controllers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    static Logger log = LogManager.getLogger(MainController.class);

    @GetMapping(value = "/")
    public String main() {
        log.info("valami");
        return "hello world";
    }
}
