package com.hsnam.notification.model.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Deprecated
@Getter
@Setter
@ToString
public class ReqSearchLocation {
    @NonNull
    private String location;
    @NonNull
    private String appId;
}
