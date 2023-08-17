package com.baskapp.microsocialnetwork.utils;

import com.baskapp.microsocialnetwork.entities.Verbs;

import java.util.Map;

public abstract class LoggerUtils {
    public static void requestLog(Verbs verb, String route, Map<String, String> headers) {
        System.out.println("########### REQUEST ###########");
        System.out.println(verb);
        System.out.println("ROUTE =:: " + route);
        System.out.println("HEADERS =:: " + headers);
        System.out.println("###############################");
    }

    public static void responseLog(String route, Object body) {
        System.out.println("########### RESPONSE ###########");
        System.out.println("ROUTE =:: " + route);
        System.out.println("RESPONSE =:: " + body);
        System.out.println("################################");
    }
}
