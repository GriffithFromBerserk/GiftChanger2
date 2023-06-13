package com.example.giftchanger;

import java.io.Serializable;

public class Present implements Serializable {  //просто класс
    private String age;
    private String price;
    private String gender;


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Present(String age, String price, String gender) {
        this.age = age;
        this.price = price;
        this.gender = gender;

    }
}