package com.csci5308.ConsoleApplication;

public class TaskOverdueException extends RuntimeException {
    public TaskOverdueException(String taskName) {
        super("Task " + taskName + " is overdue");
    }
}
