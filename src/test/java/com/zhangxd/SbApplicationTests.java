package com.zhangxd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbApplicationTests {

    @Test
    void contextLoads() {

    }

    public static void main(String[] args) {
        // java 9-17 新特性
        var str = "ssss";
        var num = 20;
        System.out.println(num);
        System.out.println(str);
    }
}
