package com.mao.dubbo.dto;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

/**
 * @author myseital
 * @date 2022/4/13 15:18
 */
//@Adaptive
public class RedCar implements Car {

    @Override
    public String getCarName(URL url) {
        return null;
    }

    @Override
    public String sayHell() {
        return null;
    }
}
