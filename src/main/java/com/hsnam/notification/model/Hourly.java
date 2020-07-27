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
public class Hourly extends Main implements Serializable {
    private static final long serialVersionUID = -5060641777101488039L;

    private Integer dt;
    @JsonProperty("dew_point")
    private Double dewPoint;
    private Integer clouds;
    private Integer visibility;
    @JsonProperty("wind_speed")
    private Double windSpeed;
    @JsonProperty("wind_deg")
    private Integer windDeg;
    private List<Weather> weather;
    private Integer pop;

}
