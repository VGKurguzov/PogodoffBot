package Weather;

import com.google.gson.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
        URL url = null;
        String lineJson= null;
        String city = "Moscow";
        String key = "580f22f7c1094333965215259192703";
        try{
            url = new URL("http://api.apixu.com/v1/current.json?key="+key+"&q="+city);
            URLConnection urlConnection = url.openConnection();
            InputStreamReader inputStreamReader = new InputStreamReader(urlConnection.getInputStream(),"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            lineJson = bufferedReader.readLine();
            System.out.println(lineJson);
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
           Weather weather = gson.fromJson(lineJson,Weather.class);
            System.out.println(weather);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
