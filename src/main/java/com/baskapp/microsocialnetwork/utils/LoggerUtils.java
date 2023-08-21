package com.baskapp.microsocialnetwork.utils;

import com.baskapp.microsocialnetwork.entities.Verbs;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public abstract class LoggerUtils {
    public static void requestLog(Verbs verb, String route, Map<String, String> headers) {
        System.out.println(verb + " ROUTE =:: " + route);
        System.out.println("HEADERS =:: " + headers);
    }
    public static void requestLog(Verbs verb, String route, Map<String, String> headers, Object body) {
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody;
        try {
            requestBody = objectMapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            requestBody = "";
        }
        System.out.println(verb + " ROUTE =:: " + route);
        System.out.println("HEADERS =:: " + headers);
        System.out.println("BODY =:: " + requestBody);
    }

    public static void responseLog(String route, Object body) {
        ObjectMapper objectMapper = new ObjectMapper();
        String responseBody;
        try {
            responseBody = objectMapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            responseBody = "";
        }
        System.out.println("ROUTE =:: " + route);
        System.out.println("RESPONSE =:: " + responseBody);
    }
}
