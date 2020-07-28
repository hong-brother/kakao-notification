package com.hsnam.notification.code;

public enum CityCode implements EnumModel{
    KOREA_SEOUL(821, "SEOUL", "서울"),
    KOREA_INCHEON(822, "INCHEON", "인천"),
    KOREA_BUSAN(823, "BUSAN", "부산");


    private Integer code;
    private String engName;
    private String korName;
    CityCode(Integer code, String engName, String korName){
        this.code = code;
        this.engName = engName;
        this.korName = korName;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getName() {
        return engName;
    }

    @Override
    public String getValue() {
        return korName;
    }
}
