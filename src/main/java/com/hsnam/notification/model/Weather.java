package com.hsnam.notification.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Weather implements Serializable {

    private static final long serialVersionUID = 7019997664162928939L;

    private Integer id;
    private String main;
    private String description;
    private String icon;
}
