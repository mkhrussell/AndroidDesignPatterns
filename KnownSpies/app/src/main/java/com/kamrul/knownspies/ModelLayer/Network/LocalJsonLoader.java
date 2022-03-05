package com.kamrul.knownspies.ModelLayer.Network;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class LocalJsonLoader {

    public static LocalJsonLoader shared = new LocalJsonLoader();

    public String loadSpies() {
        String file = "res/raw/spies.json"; // res/raw/test.txt also work.

        String json = null;
        try {
            InputStream stream = this.getClass().getClassLoader().getResourceAsStream(file);
            int size = stream.available();
            byte[] buffer = new byte[size];
            stream.read(buffer);
            stream.close();
            json = new String(buffer, StandardCharsets.UTF_8);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }
}
