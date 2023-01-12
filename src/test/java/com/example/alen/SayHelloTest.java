package com.example.alen;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class SayHelloTest {

    @Test
    void testSayHello() throws IOException {
        SayHello.main(new String[]{"en"});
    }

}