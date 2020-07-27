package com.hsnam.notification.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class FeelsLike implements Serializable {
    private static final long serialVersionUID = 7984480151953111456L;

    private Double day;
    private Double night;
    private Double eve;
    private Double morn;
}
