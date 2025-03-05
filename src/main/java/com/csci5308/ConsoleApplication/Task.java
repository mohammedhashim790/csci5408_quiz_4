package com.csci5308.ConsoleApplication;

public class Task {

    private final String taskName;

    private Member member;

    private TaskStatus taskStatus;

    private long expiryDate;


    public Task(String taskName, long expiryDate) {
        this.taskName = taskName;
    }

    public Task(String taskName, TaskStatus taskStatus, long expiryDate) {
        this.taskName = taskName;
        this.taskStatus = taskStatus;
    }

    public Task(String taskName, Member member, TaskStatus taskStatus, long expiryDate) {
        this.taskName = taskName;
        this.member = member;
        this.taskStatus = taskStatus;
    }

    public void assignTo(Member member) {

    }

    public void updateStatus(TaskStatus taskStatus) {
    }


    public void isOverdue() {
    }


    @Override
    public String toString() {
        return "Task{" + "taskName='" + taskName + '\'' + ", member=" + member + ", taskStatus=" + taskStatus + '}';
    }
}
