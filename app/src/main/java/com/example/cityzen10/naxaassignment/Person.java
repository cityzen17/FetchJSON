package com.example.cityzen10.naxaassignment;


public class Person {
    private String avatar;
    private Integer id;
    private String firstname;
    private String lastname;

    public Person(String avatar, Integer id, String firstname, String lastname) {
        this.avatar = avatar;
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
