package com.jokes.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class GeekService {


    public String getRandom() throws IOException {
        URL url = new URL("https://geek-jokes.sameerkumar.website/api?format=json");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int status = connection.getResponseCode();
        System.out.println(status);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder result = new StringBuilder();
        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null) {
            result.append(inputLine);
        }
        return result.toString().split(":")[1].replaceAll("(\"|})", "");
    }

}
