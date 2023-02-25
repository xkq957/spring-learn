package com.xkq.spring.xml;

import org.springframework.stereotype.Component;

/**
 * @author: xkq
 * @date: 2023/2/25 20:40
 * @description:
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        System.out.println("add方法执行");
        return i + j;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("sub方法执行");
        return i - j;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("mul方法执行");
        return i + j;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("div方法执行");
        return i / j;
    }
}
