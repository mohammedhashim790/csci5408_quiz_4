package com.csci5308.ConsoleApplication;

public class Member {

    private final String name;
    private final Integer id;

    public Member(String name, Integer id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Member{" + "name='" + name + '\'' + ", id=" + id + '}';
    }
}

