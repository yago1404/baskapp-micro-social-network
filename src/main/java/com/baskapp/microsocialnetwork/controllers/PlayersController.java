package com.baskapp.microsocialnetwork.controllers;

import com.baskapp.microsocialnetwork.entities.User;
import com.baskapp.microsocialnetwork.entities.Verbs;
import com.baskapp.microsocialnetwork.models.CustomResponse;
import com.baskapp.microsocialnetwork.services.UserService;
import com.baskapp.microsocialnetwork.utils.LoggerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController()
@RequestMapping("players")
public class PlayersController {
    private final UserService userService;

    @Autowired
    public PlayersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("all")
    public ResponseEntity<CustomResponse> getAllPlayers(@RequestHeader Map<String, String> headers) {
        LoggerUtils.requestLog(Verbs.GET, "players/all", headers);
        List<User> users = this.userService.getAllPlayers();
        LoggerUtils.responseLog("players/all", users);
        CustomResponse customResponse = new CustomResponse(200, "Success", users);
        return ResponseEntity.status(HttpStatus.OK).body(customResponse);
    }
}
