package com.hsnam.notification.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@ToString
public class Daily implements Serializable {
    private static final long serialVersionUID = -5665554042011975376L;

    private Integer dt;
    private Integer sunrise;
    private Integer sunset;
    private Temp temp;

    @JsonProperty("feels_like")
    private FeelsLike feelsLike;

    private Integer pressure;
    private Integer humidity;

    @JsonProperty("dew_point")
    private Double dewPoint;

    @JsonProperty("wind_speed")
    private Double windSpeed;

    @JsonProperty("wind_deg")
    private Integer windDeg;

    private List<Weather> weather;
    private Integer clouds;
    private Double pop;
    private Double uvi;
}
