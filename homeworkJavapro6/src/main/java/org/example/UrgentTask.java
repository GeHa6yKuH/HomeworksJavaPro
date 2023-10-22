package org.example;

import java.util.Date;

public class UrgentTask extends Task {

    public UrgentTask(String title, double reward) {
        super(title, new Date(), (byte) 1, reward);
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() * 2;
    }
}
