package storage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DataHandler {
    private static final Path DATA_PATH = Paths.get("data", "habits.csv");

    private DataHandler() {}

    public static Map<String, String> createRow(String habit, String date, String completed) {
        Map<String, String> row = new HashMap<>();
        row.put("habit", habit == null ? "" : habit);
        row.put("date", date == null ? "" : date);
        row.put("completed", completed == null ? "0" : completed);
        return row;
    }

    public static void ensureDataFile() {
        try {
            Files.createDirectories(DATA_PATH.getParent());
            if (!Files.exists(DATA_PATH)) {
                Files.write(DATA_PATH, "habit,date,completed\n".getBytes(StandardCharsets.US_ASCII));
            }
        } catch (IOException ex) {
            throw new RuntimeException("Failed to initialize data file", ex);
        }
    }

    public static List<Map<String, String>> loadHabits() {
        ensureDataFile();
        List<Map<String, String>> rows = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(DATA_PATH, StandardCharsets.US_ASCII);
            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i).trim();
                if (line.isEmpty()) {
                    continue;
                }
                if (i == 0 && line.startsWith("habit")) {
                    continue;
                }
                String[] parts = line.split(",", -1);
                String habit = parts.length > 0 ? parts[0] : "";
                String date = parts.length > 1 ? parts[1] : "";
                String completed = parts.length > 2 ? parts[2] : "0";
                rows.add(createRow(habit, date, completed));
            }
        } catch (IOException ex) {
            throw new RuntimeException("Failed to load habits", ex);
        }
        return rows;
    }

    public static void saveHabits(List<Map<String, String>> rows) {
        ensureDataFile();
        List<String> lines = new ArrayList<>();
        lines.add("habit,date,completed");
        for (Map<String, String> row : rows) {
            String habit = row.getOrDefault("habit", "");
            String date = row.getOrDefault("date", "");
            String completed = row.getOrDefault("completed", "0");
            lines.add(habit + "," + date + "," + completed);
        }
        try {
            Files.write(DATA_PATH, lines, StandardCharsets.US_ASCII);
        } catch (IOException ex) {
            throw new RuntimeException("Failed to save habits", ex);
        }
    }
}
