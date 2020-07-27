package com.hsnam.notification.test;

import com.hsnam.notification.model.dto.ReqWeatherDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

public class RestTest {

    private RestTemplate restTemplate;

    private String host = "http://api.openweathermap.org/data/2.5";

    private String api = "b69b828b5f2e51d39afd4da5f1b10055";


    @BeforeEach
    public void init(){
        System.out.println("init");
        this.restTemplate = new RestTemplate();
    }


    @Test
    @DisplayName("Current-Weather")
    public void getCurrentWeather(){
        String url = UriComponentsBuilder.fromHttpUrl(this.host)
                .pathSegment("weather")
                .queryParam("q", "Seoul")
                .queryParam("appid", this.api)
                .build().toString();

        System.out.println("url = " + url);

        Optional<ReqWeatherDto> resWeather = Optional.ofNullable(this.restTemplate.getForObject(url, ReqWeatherDto.class));
        System.out.println("ResWeatherDto = " + resWeather.toString());
    }

    @Test
    @DisplayName("once-Weather")
    public void getOnceCall(){
        String url = UriComponentsBuilder.fromHttpUrl(this.host)
                .pathSegment("onecall")
                .queryParam("lat", "37")
                .queryParam("lon", "126")
                .queryParam("appid", this.api)
                .build().toString();

        System.out.println("url = " + url);

        Optional<ReqWeatherDto> resWeather = Optional.ofNullable(this.restTemplate.getForObject(url, ReqWeatherDto.class));
        System.out.println("ResWeatherDto = " + resWeather.toString());
    }
}
