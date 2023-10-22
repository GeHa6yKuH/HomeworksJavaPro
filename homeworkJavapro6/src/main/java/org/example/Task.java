package org.example;

import java.util.Date;

public class Task {
    private String title;
    private Date deadline;
    private byte priority;
    private double reward;

    public Task(String title, Date deadline, byte priority, double reward) {
        this.title = title;
        this.deadline = deadline;
        this.priority = priority;
        this.reward = reward;
    }

    public String getTitle() {
        return title;
    }

    public Date getDeadline() {
        return deadline;
    }

    public byte getPriority() {
        return priority;
    }

    public double getReward() {
        return reward;
    }

    public double calculatePayment() {
        if (this.priority == 1) return 300.00 + this.getReward();
        else if (this.priority == 2) return 200.00 + this.getReward();
        else if (this.priority == 3) return 100.00 + this.getReward();
        else return 50.00 + this.getReward();
    }
}
