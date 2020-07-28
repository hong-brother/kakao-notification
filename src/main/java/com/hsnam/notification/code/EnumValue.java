package com.hsnam.notification.code;

import lombok.Data;

@Data
public class EnumValue {
    private Integer code;
    private String name;
    private String value;

    public EnumValue(EnumModel enumModel){
        this.code = enumModel.getCode();
        this.name = enumModel.getName();
        this.value = enumModel.getValue();
    }
}
