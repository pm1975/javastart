package taskmyselfagain;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    private Queue<Task> tasks = new PriorityQueue<>();
    private Scanner sc = new Scanner(System.in);

    public void loopOption() {
        Option option;
        do {
            printOptions();
            option = Option.createFromInt(sc.nextInt());
            sc.nextLine();
            switch (option) {
                case ADD:
                    tasks.offer(createAndAddTask());
                    System.out.println("Zadanie dodane.");
                    break;
                case TAKE:
                    takeTask();
                    break;
            }
        } while (option != Option.EXIT);
    }

    private void takeTask() {
        System.out.println(tasks);
        if (tasks.isEmpty()) {
            System.out.println("Nie ma zadan do wykonania");
        } else {
            System.out.println(tasks.poll());
        }
    }

    private Task createAndAddTask() {
        System.out.println("Podaj nazwe zadania:");
        String name = sc.nextLine();
        System.out.println("Podaj opis zadania:");
        String description = sc.nextLine();
        System.out.print("Podaj priotytet:");
        for (Task.Priority value : Task.Priority.values()) {
            System.out.print(" " + value);
        }
        System.out.println();
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine());
        return new Task(name, description, priority);
    }

    private void printOptions() {
        for (Option value : Option.values()) {
            System.out.println(value);
        }
    }

    private enum Option {
        ADD(1, "Dodaj zadanie"),
        TAKE(2, "Wykonaj zadanie"),
        EXIT(3, "Wyjscie")
        ;
        private int index;
        private String description;

        Option(int index, String description) {
            this.index = index;
            this.description = description;
        }
        static Option createFromInt(int value) {
            return Option.values()[value - 1];
        }

        @Override
        public String toString() {
            return index + " - " + description;
        }
    }
}
