package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskManager<T extends Task> {

    public static void main(String[] args) {

        // creating task examples

        Task t1 = new Task("go through array", new Date(), (byte) 2, 20.00);
        Task t2 = new Task("create a stream", new Date(), (byte) 2, 10.00);
        Task t3 = new Task("make Classes Hierarchy", new Date(), (byte) 3, 50.00);
        Task t4 = new Task("write JUnit testing", new Date(), (byte) 1, 100.00);
        Task t5 = new Task("create a repository", new Date(), (byte) 1, 20.00);
        Task t6 = new Task("push everything", new Date(), (byte) 3, 40.00);

        UrgentTask ut1 = new UrgentTask("create a database", 80.00);
        UrgentTask ut2 = new UrgentTask("contact a software engineer", 180.00);
        UrgentTask ut3 = new UrgentTask("add Maven dependencies", 200.00);

        PriorityTask pt1 = new PriorityTask("Accept rules and conditions", new Date(), (byte) 2, 90.00, (byte) 2);
        PriorityTask pt2 = new PriorityTask("get ready for new tasks", new Date(), (byte) 1, 100.00, (byte) 2);
        PriorityTask pt3 = new PriorityTask("go and drink some coffee", new Date(), (byte) 2, 190.00, (byte) 1);

        // adding some tasks to list

        TaskManager<Task> taskManager = new TaskManager<>();
        taskManager.addTask(ut1);
        taskManager.addTask(t3);
        taskManager.addTask(pt1);
        taskManager.addTask(pt2);
        taskManager.addTask(pt3);

        // calculating sum according to written method

        System.out.println("Calculated sum: " + taskManager.calculateTotalPayment());


    }


    // creating a list of tasks
    public List<T> list = new ArrayList<>();

    // method adding new tasks
    public void addTask(T task) {
        list.add(task);
    }


    // method calculating new tasks

    public double calculateTotalPayment() {
        return list.stream()
                .mapToDouble(Task::calculatePayment)
                .sum();
    }

}
