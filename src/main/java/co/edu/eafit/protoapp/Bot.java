package co.edu.eafit.protoapp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.*;

public class Bot {

    public String Saludo() {
        try {
            URL url = new URL("https://w8rs3evrl4.execute-api.us-east-1.amazonaws.com/Prod/hello");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));
            System.out.println("here");
            String output = br.readLine();
            JSONObject obj = new JSONObject(output);
            conn.disconnect();
            return obj.getString("message");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //gg
        System.out.println("here");
        return "";
    }


    public Double cuadrado(Double numero) {
        return numero * numero;
    }
}
