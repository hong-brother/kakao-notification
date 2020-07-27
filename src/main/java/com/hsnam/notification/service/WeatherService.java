package com.hsnam.notification.service;

import com.hsnam.notification.model.dto.ReqOnceCallDto;
import com.hsnam.notification.model.dto.ReqWeatherDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Optional;

@Slf4j
@Service
public class WeatherService {

    @Value("weather.host")
    private String host;

    @Value("weather.app.id")
    private String appId;

    @Autowired
    private RestTemplate restTemplate;

    public Optional<ReqWeatherDto> getWeather(){
        String url = UriComponentsBuilder.fromHttpUrl(this.host)
                .pathSegment("weather")
                .queryParam("q", "Seoul")
                .queryParam("appid", this.appId)
                .build().toString();
        log.info("URL = {}", url);
        return Optional
                .ofNullable(this.restTemplate.getForObject(url, ReqWeatherDto.class));
    }

    public Optional<ReqOnceCallDto> getOnceCall(){
        String url = UriComponentsBuilder.fromHttpUrl(this.host)
                .pathSegment("onecall")
                .queryParam("lat", "37")
                .queryParam("lon", "126")
                .queryParam("appid", this.appId)
                .build().toString();
        log.info("URL = {}", url);
        return Optional
                .ofNullable(this.restTemplate.getForObject(url, ReqOnceCallDto.class));
    }
}
