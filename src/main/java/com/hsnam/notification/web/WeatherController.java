package com.hsnam.notification.web;

import com.hsnam.notification.code.CityCode;
import com.hsnam.notification.code.EnumValue;
import com.hsnam.notification.component.EnumComponent;
import com.hsnam.notification.model.dto.ResMessage;
import com.hsnam.notification.model.dto.ResOnceCallDto;
import com.hsnam.notification.model.dto.ResWeatherDto;
import com.hsnam.notification.service.WeatherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Api
@Slf4j
@RestController
@RequestMapping("/v1/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;
    @Autowired
    private EnumComponent enumComponent;

    @ApiOperation(value = "Get Service Location", notes = "서비스 위치 목록 조회")
    @GetMapping("/location")
    public ResponseEntity<ResMessage> findByLocation(){
        List<EnumValue> enumValueList = enumComponent.toEnumValues(CityCode.class);
        return ResponseEntity.ok(ResMessage.builder().data(enumValueList).build());
    }

    @ApiOperation(value = "", notes = "")
    @GetMapping("/{location}/weather")
    public ResponseEntity<ResMessage> findByCurrent(@PathVariable("location") String location){
        Optional<ResWeatherDto> resultReq =  weatherService.getWeather(location);
        if(!resultReq.isEmpty()){
            return ResponseEntity.ok(ResMessage.builder().data(resultReq.get()).build());
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                    body(ResMessage.builder()
                            .message("REST API ERROR")
                            .build());
        }
    }

    @GetMapping("lat/{lat}/lon/{lon}/weather")
    public ResponseEntity<ResMessage> findAll(@PathVariable("lat") Double lat,
                                              @PathVariable("lon") Double lon){
        Optional<ResOnceCallDto> resultReq = weatherService.getOnceCall(lat, lon);
        if(!resultReq.isEmpty()){
            return ResponseEntity.ok(ResMessage.builder().data(resultReq.get()).build());
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                    body(ResMessage.builder()
                            .message("REST API ERROR")
                            .build());
        }
    }


}
