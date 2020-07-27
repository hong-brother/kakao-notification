package com.hsnam.notification.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class ReqOnceCallDto implements Serializable {

    private static final long serialVersionUID = 9107729010997925139L;

    private Double lat;
    private Double lon;
    private String timezone;
    @JsonProperty("timezone_offset")
    private Integer timezoneOffset;
}
