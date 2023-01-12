package com.example.alen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class SayHello {

    public static void main(String[] args) throws IOException {
        final String language = args[0];
        final InputStream resourceStream = SayHello.class.getClassLoader().getResourceAsStream(language + ".txt");
        assert resourceStream != null;
        final BufferedReader reader = new BufferedReader(new InputStreamReader(resourceStream, StandardCharsets.UTF_8));

        System.out.println(reader.readLine());
    }
}