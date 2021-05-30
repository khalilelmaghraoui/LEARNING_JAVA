package com.Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

public class MapProgram {
    public static void main(String[] args) throws IOException {
        Map<String,String> languages = new HashMap<String,String>();
        Set<String>  set = new HashSet<String>();
        languages.put("java","high compiled level OOP");
        languages.put("Python","an interpreter , OOP");
        languages.put("c","low level programming lng ");
        languages.put("algorithm","an algorithmic language");
        System.out.println(languages.get("c"));


        for (String key:languages.keySet()) {
            System.out.println(key +" : " + languages.get(key));

        }
        languages.remove("javaa");
//        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//        int n = parseInt(in.readLine());
//        System.out.println(n);
//


    }
}
