package com.hsnam.notification.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Sys implements Serializable {

    private static final long serialVersionUID = 1392911429814753313L;

    private Integer type;
    private Integer id;
    private String country;
    private Integer sunrise;
    private Integer sunset;
}
