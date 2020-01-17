package task;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Piotr on 2020-01-17
 */
public class TaskManager {
    private Queue<Task> taskQueue = new PriorityQueue<>();
    private Scanner sc = new Scanner(System.in);

    void mainLoop() {
        Option option;
        do {
            printOption();
            System.out.println("Wybierz opcję:");
            option = Option.createFromInt(sc.nextInt());
            sc.nextLine();
            switch (option) {
                case ADD:
                    taskQueue.offer((readAndCreateTask()));
                    System.out.println("Zadanie dodane do kolejki");
                    break;
                case TAKE:
                    takeTask();
                    break;
                case EXIT:
                    break;
            }
        } while (option != Option.EXIT);
    }

    private void takeTask() {
        if (taskQueue.isEmpty()) {
            System.out.println("Brak zadań do wykonania");
        } else {
            Task nextTask = taskQueue.poll();
            System.out.println("Zadanie do wykonania: ");
            System.out.println(nextTask);
        } 
    }

    private Task readAndCreateTask() {
        System.out.println("Podaj nazwę zadania:");
        String name = sc.nextLine();
        System.out.println("Podaj opis zadania:");
        String description = sc.nextLine();
        System.out.print("Podaj priorytet, ");
        for (Task.Priority priority : Task.Priority.values()) {
            System.out.print(priority + " ");
        }
        System.out.println();
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine());
        return new Task(name, description, priority);
    }

    private void printOption() {
        for (Option value : Option.values()) {
            System.out.println(value);
        }
    }

    private enum Option {
        ADD(0, "Dodaj zadanie"),
        TAKE(1, "Zrób kolejne zadanie"),
        EXIT(2, "Wyjdź");

        int option;
        String description;

        Option(int option, String description) {
            this.option = option;
            this.description = description;
        }

        static Option createFromInt(int option) {
            return values()[option];
        }

        @Override
        public String toString() {
            return option + " - " + description;
        }
    }

}
