package com.grisbi.masterspringbootfirstproject.service;

import com.grisbi.masterspringbootfirstproject.domain.StringPayload;
import org.springframework.stereotype.Service;

@Service
public class StringUtilitiesService {
   public StringPayload welcome(StringPayload payload){
       String temp = "Hola " + payload.name() + ", bienvenido a Spring Boot.";
       return  new StringPayload(temp);
    }
}
