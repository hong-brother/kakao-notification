package com.hsnam.notification.test;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void test(){
        Optional<String> opt = Optional.ofNullable("java optional Object");
        System.out.println(opt);

    }
}
