package com.bwolfs.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


/**
 * Created by BartWolfs on 04/04/2017.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        // Make a URL to the web page
        Document doc = Jsoup.connect("http://reebokcrossfit020.nl/category/blog/wod/").get();

        Elements workouts = doc.select("div.post-content-container");

        for(Element workout : workouts){
            String title = workout.select("a").first().text();
            String description = workout.select("p").first().text();

            Elements exercises = workout.select("p");

            System.out.println("Title: " + title);
            int i = 1;

            for(Element exercise : exercises){
                if(exercise == workout.select("p").first()){
                    System.out.println("Description: " + description);
                }else if(exercise.toString().toLowerCase().contains("build")){
                    System.out.println(exercise.text());
                }else if(exercise.toString().length() > 13) {
                    System.out.println("Exercise #" + i + ": " + exercise.text());
                    i++;
                }else{
                    break;
                }
            }
        }
    }
}
