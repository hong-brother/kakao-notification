package com.hsnam.notification.test;

import com.hsnam.notification.code.CityCode;
import com.hsnam.notification.code.EnumValue;
import com.hsnam.notification.component.EnumComponent;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
public class EnumTest {

    @Test
    public void getListEnum(){
        List<Enum> cityList = Arrays.asList(CityCode.values());
        System.out.println(cityList);
    }

    @Test
    public void getListHashMapEnum(){
        EnumComponent enumComponent = new EnumComponent();
        List<EnumValue> enumValueList = enumComponent.toEnumValues(CityCode.class);
        System.out.println(enumValueList.toString());

    }
}
