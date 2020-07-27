package com.hsnam.notification.web;

import com.hsnam.notification.model.dto.ResMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/weather")
public class WeatherController {

    @GetMapping("/current")
    public ResponseEntity<ResMessage> getCurrentWeather(){
        return null;
    }


}
