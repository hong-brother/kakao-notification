package com.hsnam.notification.model.dto;

import com.hsnam.notification.model.Clouds;
import com.hsnam.notification.model.Coord;
import com.hsnam.notification.model.Main;
import com.hsnam.notification.model.Sys;
import com.hsnam.notification.model.Weather;
import com.hsnam.notification.model.Wind;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
@ToString
public class ResWeatherDto implements Serializable {

    private static final long serialVersionUID = -3398531481584977288L;

    private Integer cod;
    private String message;
    private Coord coord;
    private List<Weather> weather;
    private String base;
    private Main main;
    private Integer visibility;
    private Wind wind;
    private Clouds clouds;
    private Integer dt;
    private Sys sys;
    private Integer timezone;
    private Integer id;
    private String name;
}
