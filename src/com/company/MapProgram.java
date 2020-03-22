package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> language = new HashMap<>();
        language.put("Java", "a compiled high level, bla bla bla...");
        language.put("Python", "an interpreted, OOP, ");
        language.put("Algol", "and algorithmic language");
        language.put("BASIC", "Beginners all purpose symbolic");

        System.out.println(language.get("Java"));

        if(language.replace("Python", "an interpreted, OOP, ", "a functional programming language")){
            System.out.println("Python replaced");
        } else {
            System.out.println("Python was not replaced");
        }

        for(String key: language.keySet()){
            System.out.println(key + " : " + language.get(key));
        }
    }
}
