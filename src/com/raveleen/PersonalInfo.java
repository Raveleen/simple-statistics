package com.raveleen;

public class PersonalInfo {
    private String name;
    private String surname;
    private String email;
    private String city;
    /**
     * Country: 0 - Ukraine;
     *          1 - Poland;
     *          2 - Russia;
     *          3 - Germany;
     * Gender:  0 - male;
     *          1 - female;
     */
    private int country;
    private int gender;

    public PersonalInfo() {
    }

    public PersonalInfo(String name, String surname, String email, String city, int country, int gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.city = city;
        this.country = country;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
