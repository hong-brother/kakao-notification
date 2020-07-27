package com.hsnam.notification.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class Wind implements Serializable {

    private static final long serialVersionUID = -7522274418317847326L;

    private Double speed;
    private Integer deg;
}
