# JJRAM 🤖

### Smart Habit Tracker CLI — AI-Powered Productivity Assistant

![Project Status](https://img.shields.io/badge/Status-In%20Development-yellow)
![Language](https://img.shields.io/badge/Language-Java-blue)
![License](https://img.shields.io/badge/License-MIT-green)

---

## 📌 Overview

**JJRAM** is a command-line productivity tool that helps users build and maintain consistent habits by combining daily
habit logging with an AI-powered insight engine. Rather than simply tracking whether a habit was completed, JJRAM
analyzes behavioral patterns over time, detects trends, predicts burnout risks, and delivers personalized, actionable
suggestions — all from the terminal.

In today's fast-paced world, many people struggle to build consistent habits not because they lack motivation, but
because they lack **visibility into their own behavior**. JJRAM bridges that gap by turning raw completion data into
meaningful, human-readable feedback that empowers users to make smarter decisions about how and when they pursue their
goals.

---

## 📸 Screenshots

> _Screenshots and demo assets will be added here as the project develops._

| Feature           | Preview         |
|-------------------|-----------------|
| Main Menu         | *(coming soon)* |
| Habit Tracker     | *(coming soon)* |
| Stats Dashboard   | *(coming soon)* |
| AI Insights Panel | *(coming soon)* |

<!-- To add a screenshot, place the image in /assets/screenshots/ and use:
![Feature Name](assets/screenshots/your-image.png)
-->

---

## ✨ Features

- **Add & Manage Habits** — Create custom habits and log daily completions with a simple CLI menu
- **Streak Tracking** — Automatically calculates current and longest streaks for each habit
- **Completion Statistics** — View weekly summaries and overall completion rates
- **AI Insight Engine** — Detects behavioral patterns and delivers personalized suggestions:
    - Identifies your most consistent habits
    - Finds your most-skipped days
    - Detects habit drop-off trends
    - Predicts burnout risk based on recent performance
    - Recommends optimal scheduling based on your patterns

---

## 🖥️ CLI Preview

```
============================================
      JJRAM — Smart Habit Tracker CLI
============================================

  1. Add Habit
  2. Mark Habit Complete
  3. View Stats
  4. View AI Insights
  5. Exit

============================================
```

**Sample AI Insights Output:**

```
🤖 Smart Insights:

  • You are 80% consistent with studying.
  • You skip workouts mostly on Saturdays.
  • Your best productivity day is Tuesday.
  • Suggestion: Move difficult tasks to Tuesday.
  • ⚠️  Burnout Risk: You missed 3 of your last 5 workout sessions.
```

---

## 🗂️ Project Structure

```
JJRAM/
├── Main.java                # Entry point & CLI menu
├── storage/
│   └── DataHandler.java     # File I/O, CSV/text storage
├── engine/
│   ├── Stats.java           # Streaks, completion rates, summaries
│   └── Insights.java        # AI pattern detection & suggestions
├── assets/
│   └── screenshots/         # UI screenshots (add here)
├── data/
│   └── habits.csv           # Local habit data storage
├── README.md
```

---

## 👥 Team

| Name                 | Role                                                           |
|----------------------|----------------------------------------------------------------|
| **Abdul Fornah**     | Programmer & Designer — CLI menu, navigation, UI design        |
| **John Arthur**      | Programmer — Data storage, file I/O, CSV handling              |
| **Jordan Tang**      | Project Management — Coordination, planning, timelines         |
| **Max Pridac**       | Programmer — Statistics engine, streak & completion logic      |
| **Ramya Bommakanti** | Version Control & Bug Analysis — Git management, QA, debugging |

---

## 🚀 Getting Started

### Prerequisites

- Java 11 or higher

### Installation

```bash
# Clone the repository
git clone https://github.com/your-team/JJRAM.git

# Navigate into the project directory
cd JJRAM

# Compile
javac Main.java storage/DataHandler.java engine/Stats.java engine/Insights.java
```

### Running the App

```bash
java Main
```

---

## 🧠 How the AI Works

JJRAM uses **rule-based pattern detection** — no complex machine learning required. The insight engine works by:

1. **Pattern Detection** — Scans completion history to find the most skipped days, strongest habits, and drop-off trends
2. **Simple Prediction** — Applies rule logic (e.g., "missed 3 of last 5 sessions → flag burnout risk")
3. **Smart Suggestions** — Maps detected patterns to actionable recommendations tailored to the user's schedule

---

## 🗺️ Roadmap

- [x] Project planning & role assignment
- [ ] CLI menu system
- [ ] Data storage module
- [ ] Statistics engine
- [ ] AI insight engine
- [ ] Integration & testing
- [ ] Final polish & demo

---

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

<p align="center">Built with 💙 by Team JJRAM</p>
