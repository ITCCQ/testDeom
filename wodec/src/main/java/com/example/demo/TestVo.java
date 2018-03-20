package com.example.demo;

public class TestVo {
    String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public String toString() {
        return "TestVo{" +
                "hello='" + hello + '\'' +
                '}';
    }
}
