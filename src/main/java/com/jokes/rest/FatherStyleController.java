package com.jokes.rest;

import com.jokes.service.FatherStylesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class FatherStyleController {

    @Autowired
    FatherStylesService fatherStylesService;

    @GetMapping(path = "fs/get")
    public ResponseEntity<String> getRandom() {
        try {
            return ResponseEntity.ok(fatherStylesService.getRandom());
        } catch (IOException e) {
            return ResponseEntity.internalServerError().body("Something went wrong");
        }
    }


}
