package com.csci5308.ConsoleApplication;

public class Task {

    private final String taskName;

    private Member member;

    private TaskStatus taskStatus;

    private long dueDate;


    public Task(String taskName, long dueDate) {
        this.taskName = taskName;
        this.dueDate = dueDate;
    }

    public Task(String taskName, TaskStatus taskStatus, long dueDate) {
        this.taskName = taskName;
        this.taskStatus = taskStatus;
        this.dueDate = dueDate;
    }

    public Task(String taskName, Member member, TaskStatus taskStatus, long dueDate) {
        this.taskName = taskName;
        if(member == null) {
            throw new IllegalArgumentException("Member cannot be null");
        }
        this.member = member;
        this.taskStatus = taskStatus;
        this.dueDate = dueDate;

    }

    public Member assignTo(Member member) {
        if(member == null) {
            throw new IllegalArgumentException("Member cannot be null");
        }
        this.member = member;
        return member;
    }

    public TaskStatus updateStatus(TaskStatus taskStatus) {
        if(taskStatus == null) {
            throw new IllegalArgumentException("TaskStatus cannot be null");
        }
        this.taskStatus = taskStatus;
        return taskStatus;
    }


    public boolean isOverdue() {
        if(dueDate < System.currentTimeMillis()) {
            throw new TaskOverdueException(this.taskName);
        }
        return true;
    }


    @Override
    public String toString() {
        return "Task{" + "taskName='" + taskName + '\'' + ", member=" + member + ", taskStatus=" + taskStatus + '}';
    }
}
