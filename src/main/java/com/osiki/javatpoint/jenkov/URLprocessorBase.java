package com.osiki.javatpoint.jenkov;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public abstract class URLprocessorBase {

    public void process(URL url) throws IOException{
        URLConnection urlConnection = url.openConnection();
        InputStream input = urlConnection.getInputStream();

        try{
            processedURLData(input);
        }finally{
            input.close();
        }
    }



    protected abstract void processedURLData(InputStream input)
        throws IOException;

}
