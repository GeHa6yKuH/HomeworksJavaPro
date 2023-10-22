package org.example;

import java.util.Date;

public class PriorityTask extends Task{
    private byte requiredPriority;

    public PriorityTask(String title, Date deadline, byte priority, double reward, byte requiredPriority) {
        super(title, deadline, priority, reward);
        this.requiredPriority = requiredPriority;
    }

    @Override
    public double calculatePayment() {
        return super.getPriority() == this.requiredPriority ? super.calculatePayment() : 0.00;
    }
}
