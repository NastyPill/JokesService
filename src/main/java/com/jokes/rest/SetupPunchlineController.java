package com.jokes.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class SetupPunchlineController {


    @GetMapping(path = "/sp/get")
    public HttpResponse<String> getRandom() {
        throw new UnsupportedOperationException();
    }


}

