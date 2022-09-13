package com.example.data;

public class Address {
    private String flatNo;
    private String buildingName;

    private String street;
    private String city;
    private String state;

    private int pinCode;

    private String country;

    public Address() {
    }

    public Address(String flatNo, String buildingName, String street, String city, String state, int pinCode, String country) {
        this.flatNo = flatNo;
        this.buildingName = buildingName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.country = country;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public void setFlatNo(String flatNo) {
        this.flatNo = flatNo;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNo='" + flatNo + '\'' +
                ", buildingName='" + buildingName + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                ", country='" + country + '\'' +
                '}';
    }
}
