package com.jokes.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class SetupPunchlineService extends JokesService {

    public String getRandom() throws IOException {
        URL url = new URL("https://official-joke-api.appspot.com/random_joke");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        int status = connection.getResponseCode();
        System.out.println(status);
        return getStringFromInputStream(connection.getInputStream());
    }


}
