package engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Insights {
    private Insights() {}

    public static List<String> generateInsights(List<Map<String, String>> rows) {
        List<String> insights = new ArrayList<>();
        if (rows == null || rows.isEmpty()) {
            insights.add("Log a habit to see insights.");
            return insights;
        }

        Map<String, Integer> habitCounts = new HashMap<>();
        int completed = 0;

        for (Map<String, String> row : rows) {
            String habit = row.get("habit");
            if (habit != null && !habit.isEmpty()) {
                habitCounts.put(habit, habitCounts.getOrDefault(habit, 0) + 1);
            }
            if ("1".equals(row.get("completed"))) {
                completed++;
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

        double rate = rows.isEmpty() ? 0 : (completed * 100.0) / rows.size();

        insights.add("Most logged habit: " + topHabit);
        insights.add("Overall completion rate: " + String.format("%.1f", rate) + "%");
        insights.add("Tip: Keep streaks small and consistent to avoid burnout.");
        return insights;
    }
}
