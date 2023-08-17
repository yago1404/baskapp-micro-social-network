package com.baskapp.microsocialnetwork.controllers;

import com.baskapp.microsocialnetwork.entities.Verbs;
import com.baskapp.microsocialnetwork.utils.LoggerUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("players")
public class PlayersController {

    @GetMapping("all")
    public static @ResponseBody String getAllPlayers() {
        LoggerUtils.log(Verbs.GET, "players/all", "");
        return "Todos os usuários";
    }
}
