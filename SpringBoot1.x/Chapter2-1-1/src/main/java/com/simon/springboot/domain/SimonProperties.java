package com.simon.springboot.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SimonProperties {

    @Value("${com.simon.springboot.name}")
    private String name;

    @Value("${com.simon.springboot.title}")
    private String titles;

    @Value("${com.simon.springboot.description}")
    private String desc;


    @Value("${com.simon.springboot.string}")
    private String string;

    @Value("${com.simon.springboot.int}")
    private int anInt;

    @Value("${com.simon.springboot.long}")
    private long aLong;

    @Value("${com.simon.springboot.test1}")
    private int test1;

    @Value("${com.simon.springboot.test2}")
    private int test2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {
        this.titles = titles;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public long getaLong() {
        return aLong;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }
}
