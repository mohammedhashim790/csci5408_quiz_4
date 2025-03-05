package com.csci5308.ConsoleApplication;

public class Member {

    private final String teamName;
    private final Integer memberId;

    public Member(String teamName, Integer memberId) {
        this.teamName = teamName;
        this.memberId = memberId;
    }


    @Override
    public String toString() {
        return "Member{" + "teamName='" + teamName + '\'' + ", memberId=" + memberId + '}';
    }
}

