package com.jokes.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class FatherStylesService extends JokesService {

    public String getRandom() throws IOException {
        URL url = new URL("https://icanhazdadjoke.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accept", "text/plain");
        int status = connection.getResponseCode();
        System.out.println(status);
        return getStringFromInputStream(connection.getInputStream());
    }

}
