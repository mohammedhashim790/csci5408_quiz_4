package com.csci5308.ConsoleApplication;

public class Task {

    private final String taskName;

    private Member member;

    private TaskStatus taskStatus;

    private long dueDate;


    public Task(String taskName, long dueDate) {
        this.taskName = taskName;
    }

    public Task(String taskName, TaskStatus taskStatus, long dueDate) {
        this.taskName = taskName;
        this.taskStatus = taskStatus;
    }

    public Task(String taskName, Member member, TaskStatus taskStatus, long dueDate) {
        this.taskName = taskName;
        this.member = member;
        this.taskStatus = taskStatus;
    }

    public Member assignTo(Member member) {
        return null;
    }

    public TaskStatus updateStatus(TaskStatus taskStatus) {
        return null;
    }


    public boolean isOverdue() {

        return false;
    }


    @Override
    public String toString() {
        return "Task{" + "taskName='" + taskName + '\'' + ", member=" + member + ", taskStatus=" + taskStatus + '}';
    }
}
