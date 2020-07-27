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
public class Current extends Main implements Serializable {

    private static final long serialVersionUID = 8862054521639495722L;

    private Integer dt;
    private Integer sunrise;
    private Integer sunset;
    //include main
    @JsonProperty("dew_point")
    private Double dewPoint;
    private Double uvi;
    private Integer visibility;
    private Double windSpeed;
    private Double windDeg;
    private List<Weather> weather;
}
