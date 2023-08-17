package com.baskapp.microsocialnetwork.utils;


import com.baskapp.microsocialnetwork.entities.Verbs;

public abstract class LoggerUtils {
    public static void log(Verbs verb, String route, String header) {
        System.out.println("###########");
        System.out.println(verb);
        System.out.println(route);
        System.out.println(header);
    }
}
