package com.example;

import java.util.ArrayList;

public class Lesson9
{
    public static void main( String[] args )
    {
        MovieDTB info = new MovieDTB();
        ArrayList<Movie> list = info.getData();
        info.printData(list);
    }
}
