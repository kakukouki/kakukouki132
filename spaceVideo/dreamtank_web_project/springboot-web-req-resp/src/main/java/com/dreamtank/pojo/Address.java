package com.dreamtank.pojo;

public class Address {
    private String Province;
    private String City;

    public Address(String province, String city) {
        Province = province;
        City = city;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "Province='" + Province + '\'' +
                ", City='" + City + '\'' +
                '}';
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String province) {
        Province = province;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
