package com.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;


public class MovieDTB {

    public ArrayList<Movie> getData() {
        ArrayList<Movie> movieData = new ArrayList<>();
        try {

            Gson gson = new Gson();
           
            FileReader reader = new FileReader("JAVA/lesson9/src/main/java/com/example/Movie.json");

            Type objectType = new TypeToken<ArrayList<Movie>>() {
            }.getType();

            movieData = gson.fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return movieData;
    }
   public void printData(ArrayList<Movie> list){
        for (Movie p: list) {
                System.out.println(p);
            }

}
}