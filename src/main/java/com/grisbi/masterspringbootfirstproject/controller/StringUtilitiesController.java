package com.grisbi.masterspringbootfirstproject.controller;

import com.grisbi.masterspringbootfirstproject.domain.StringPayload;
import com.grisbi.masterspringbootfirstproject.service.StringUtilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringUtilitiesController {
    private final StringUtilitiesService stringUtilitiesService;

    @Autowired
    public StringUtilitiesController(StringUtilitiesService stringUtilitiesService) {
        this.stringUtilitiesService = stringUtilitiesService;
    }

    @PostMapping("/welcome")
    public @ResponseBody StringPayload toUpperCase(@RequestBody StringPayload payload){
        return stringUtilitiesService.welcome(payload);
    }
}

