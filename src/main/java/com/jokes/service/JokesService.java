package com.jokes.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JokesService {

    //public for tests
    public String getStringFromInputStream(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder result = new StringBuilder();
        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null) {
            result.append(inputLine);
        }
        return result.toString();
    }

}
