package com.hsnam.notification.component;

import com.hsnam.notification.code.EnumModel;
import com.hsnam.notification.code.EnumValue;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EnumComponent {

    public List<EnumValue> toEnumValues(Class<? extends EnumModel> e){
        return Arrays.stream(e.getEnumConstants()).map(EnumValue::new).collect(Collectors.toList());
    }

}
