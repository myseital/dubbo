package com.mao.dubbo;

import com.mao.dubbo.dto.Car;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Protocol;

/**
 * @author myseital
 * @date 2022/4/13 14:02
 */
public class Main {

    public static void main(String[] args) {
//        ExtensionLoader<Protocol> extensionLoader = ExtensionLoader.getExtensionLoader(Protocol.class);
//        Protocol protocol = extensionLoader.getExtension("http", false);
//        System.out.println(protocol);
        ExtensionLoader<Car> carExtensionLoader = ExtensionLoader.getExtensionLoader(Car.class);
//        Car car = carExtensionLoader.getExtension("car");
//        System.out.println(car);
        Car adaptiveExtension = carExtensionLoader.getAdaptiveExtension();
//        carExtensionLoader.getActivateExtension();
        System.out.println(adaptiveExtension);
    }
}
