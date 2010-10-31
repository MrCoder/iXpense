package com.tw.gae.ixpense;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

import static junit.framework.Assert.fail;

public class HttpConnectionTest {
    @Test
    public void should_post_a_message() throws IOException, MalformedURLException, ProtocolException {
        String message = URLEncoder.encode("my message", "UTF-8");

        URL url = new URL("http://127.0.0.1/index.html");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            // OK
        } else {
            // Server returned HTTP error code.
            fail("Server returned HTTP error code:" + connection.getResponseCode());
        }
    }
}
