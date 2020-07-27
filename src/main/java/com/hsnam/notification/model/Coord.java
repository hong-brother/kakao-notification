package com.hsnam.notification.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Coord implements Serializable {

    private static final long serialVersionUID = 3039064760564206553L;

    private Double lon;
    private Double lat;
}
