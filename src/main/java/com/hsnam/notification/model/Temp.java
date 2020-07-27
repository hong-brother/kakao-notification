package com.hsnam.notification.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Temp implements Serializable {
    private static final long serialVersionUID = -4867777692201734230L;

    private Double day;
    private Double min;
    private Double max;
    private Double night;
    private Double eve;
    private Double morn;
}
