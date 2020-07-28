package com.hsnam.notification.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Deprecated
@Getter
@Setter
@ToString
public class ReqSearchWeather {
    private Double lat;
    private Double lon;
    private String appId;
}
