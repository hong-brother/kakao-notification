package com.hsnam.notification.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class ResMessage<T> implements Serializable {
    private static final long serialVersionUID = 8450132684049451446L;

    private Integer code;
    private String message;
    private T data;
}
