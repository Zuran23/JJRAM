import engine.Insights;
import engine.Stats;
import storage.DataHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static void showMenu() {
        System.out.println("============================================");
        System.out.println("      JJRAM - Smart Habit Tracker CLI");
        System.out.println("============================================");
        System.out.println("1. Add Habit");
        System.out.println("2. Mark Habit Complete");
        System.out.println("3. View Stats");
        System.out.println("4. View AI Insights");
        System.out.println("5. Exit");
        System.out.println("============================================");
    }

    public static void main(String[] args) {
        List<Map<String, String>> habits = DataHandler.loadHabits();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            showMenu();
            System.out.print("Select an option: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1": {
                    System.out.print("Habit name: ");
                    String name = scanner.nextLine().trim();
                    if (!name.isEmpty()) {
                        habits.add(DataHandler.createRow(name, "", "0"));
                        DataHandler.saveHabits(habits);
                    }
                    break;
                }
                case "2": {
                    System.out.print("Habit to mark complete: ");
                    String name = scanner.nextLine().trim();
                    if (!name.isEmpty()) {
                        habits.add(DataHandler.createRow(name, "", "1"));
                        DataHandler.saveHabits(habits);
                    }
                    break;
                }
                case "3": {
                    String summary = Stats.computeSummary(habits);
                    System.out.println("\nStats Summary");
                    System.out.println(summary);
                    break;
                }
                case "4": {
                    List<String> insights = Insights.generateInsights(habits);
                    System.out.println("\nAI Insights");
                    for (String item : insights) {
                        System.out.println("- " + item);
                    }
                    break;
                }
                case "5":
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
