package com.baskapp.microsocialnetwork.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("players")
public class PlayersController {

    @GetMapping("all")
    public static @ResponseBody String getAllPlayers() {
        System.out.println("###");
        System.out.println("GET /playes/all");
        return "Todos os usuários";
    }
}
