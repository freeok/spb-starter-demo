package com.example.mystarterspringbootstarter;

/**
 * created at 2021/5/10 8:14
 */
public class MyStarterService {
    private MyStarterProperties properties;

    public MyStarterService() {
    }

    public MyStarterService(MyStarterProperties properties) {
        this.properties = properties;
    }

    public void sayHello() {
        System.out.printf("hi,我叫%s\n今年%d岁\n性别%s%n", properties.getName(), properties.getAge(), properties.getSex());
    }
}
