package engine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Stats {
    private Stats() {}

    public static String computeSummary(List<Map<String, String>> rows) {
        if (rows == null || rows.isEmpty()) {
            return "No habit data yet.";
        }

        int total = rows.size();
        int completed = 0;
        Map<String, Integer> habitCounts = new HashMap<>();

        for (Map<String, String> row : rows) {
            if ("1".equals(row.get("completed"))) {
                completed++;
            }
            String habit = row.get("habit");
            if (habit != null && !habit.isEmpty()) {
                habitCounts.put(habit, habitCounts.getOrDefault(habit, 0) + 1);
            }
        }

        String topHabit = "N/A";
        int topCount = 0;
        for (Map.Entry<String, Integer> entry : habitCounts.entrySet()) {
            if (entry.getValue() > topCount) {
                topHabit = entry.getKey();
                topCount = entry.getValue();
            }
        }

        double rate = total == 0 ? 0 : (completed * 100.0) / total;

        return "Total entries: " + total + "\n"
            + "Completed: " + completed + "\n"
            + "Completion rate: " + String.format("%.1f", rate) + "%\n"
            + "Most logged habit: " + topHabit;
    }
}
