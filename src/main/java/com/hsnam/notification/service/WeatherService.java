package com.hsnam.notification.service;

import com.hsnam.notification.model.dto.ResOnceCallDto;
import com.hsnam.notification.model.dto.ResWeatherDto;
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

    @Value("${weather.host}")
    private String host;

    @Value("${weather.app.id}")
    private String appId;

    @Autowired
    private RestTemplate restTemplate;

    public Optional<ResWeatherDto> getWeather(String location){
        String url = UriComponentsBuilder.fromHttpUrl(this.host)
                .pathSegment("weather")
                .queryParam("q", location)
                .queryParam("appid", this.appId)
                .build().toString();
        log.info("URL = {}", url);
        return Optional
                .ofNullable(this.restTemplate.getForObject(url, ResWeatherDto.class));
    }

    public Optional<ResOnceCallDto> getOnceCall(Double lat, Double lon){
        String url = UriComponentsBuilder.fromHttpUrl(this.host)
                .pathSegment("onecall")
                .queryParam("lat", lat)
                .queryParam("lon", lon)
                .queryParam("appid", this.appId)
                .build().toString();
        log.info("URL = {}", url);
        return Optional
                .ofNullable(this.restTemplate.getForObject(url, ResOnceCallDto.class));
    }
}
