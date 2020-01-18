package taskmyself;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Piotr on 2020-01-18
 */
public class TaskManager {
    Queue<Task> tasks = new PriorityQueue<>();
    Scanner sc = new Scanner(System.in);

    void LoopOption() {
        Option option;
        do {
            System.out.println("Wybierz opcję: ");
            printOptions();
            option = Option.createFromInt(sc.nextInt());
            sc.nextLine();
            switch (option) {
                case ADD:
                    tasks.offer(CreateAndAddTask());
                    System.out.println("Zadanie dodane");
                    break;
                case MAKE:
                    TakeAndMadeTask();
                    break;
                case EXIT:
                    break;
            }
        } while (option != Option.EXIT);
    }

    private void TakeAndMadeTask() {
        if (tasks.isEmpty()) {
            System.out.println("Brak zadań do wykonania");
        } else {
            System.out.println(tasks);
            Task task = tasks.poll();
            System.out.println("Zadanie do wykonania:");
            System.out.println(task);
        }
    }

    private Task CreateAndAddTask() {
        System.out.println("Podaj nazwę zadania");
        String name = sc.nextLine();
        System.out.println("Podaj opis zadania");
        String description = sc.nextLine();
        System.out.print("Podaj priorytet ");
        printPriorityOptions();
        Task.Priority priority = Task.Priority.valueOf(sc.nextLine());
        System.out.println();
        return new Task(name, description, priority);
    }

    private void printPriorityOptions() {
        for (Task.Priority value : Task.Priority.values()) {
            System.out.print(value + " ");
        }
    }

    private void printOptions() {
        for (Option value : Option.values()) {
            System.out.println(value);
        }
    }

    private enum Option {
        ADD(1, "Dodaj zadanie"),
        MAKE(2, "Wykonaj zadanie"),
        EXIT(3, "Wyjście")
        ;
        private int index;
        private String name;

        Option(int index, String name) {
            this.index = index;
            this.name = name;
        }
        static Option createFromInt(int option) {
            return Option.values()[option - 1]; }

        @Override
        public String toString() {
            return index + " - " + name;
        }
    }
}
