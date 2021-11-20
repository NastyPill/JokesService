package com.jokes.rest;

import com.jokes.service.SetupPunchlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SetupPunchlineController {

    @Autowired
    SetupPunchlineService setupPunchlineService;


    @GetMapping(path = "/sp/get")
    public ResponseEntity<String> getRandom() {
        try {
            return ResponseEntity.ok(setupPunchlineService.getRandom());
        } catch (IOException e) {
            return ResponseEntity.internalServerError().body("Something went wrong");
        }
    }


}

