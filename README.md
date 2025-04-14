

## 🎮 Dynamic Strategy Game — JavaFX + Dynamic Programming

An interactive and educational Java-based game that applies **Dynamic Programming** to simulate an optimal strategy decision system. The game leverages a **graphical interface (JavaFX)** and multiple input methods to create a flexible, visually engaging experience that demonstrates real-time decision-making algorithms.

---

## 💡 Project Highlights

- 🧠 Implements **Dynamic Programming** to compute the best player moves and simulate game strategy.
- 🧮 Multiple input modes:
  - Random number generation
  - Manual entry
  - Load from file
- 🎨 Built with **JavaFX**, including custom transitions, styled buttons, and animated UI flow.
- 🖱️ Interactive layout with clear user feedback and real-time visualization of results.
- 💼 Structured and modular codebase demonstrating good design and scalability.

---

## 🕹️ Game Overview

The game simulates a turn-based decision-making process, where the user (or computer) must choose numbers from a sequence in an optimal order to maximize total score. Behind the scenes, a **dynamic programming matrix** is built to analyze all possible future moves and select the most efficient path.

---

## 📦 Features

| Feature                        | Description |
|--------------------------------|-------------|
| 🎲 Multiple Input Modes        | Choose between manual, random, or file-based entry. |
| ⚙️ Dynamic Programming Engine  | Uses a 2D matrix to analyze all game states and compute the optimal sequence. |
| 👥 Two-Player or AI Option     | Users can play against each other or simulate computer decisions. |
| 🧩 Clean and Modular Codebase  | Classes are separated into logic (`Dynamic_game`), UI (`Start`, `input`, `Number`) and styling components. |
| 🧑‍🎓 Educational Purpose        | Designed to visualize how dynamic programming works in real time. |

---

## 🧠 Core Algorithm

The game solves the **Optimal Strategy for a Game** problem:

> Given a sequence of numbers, two players alternately pick a number from either end. The goal is to maximize the total. The game uses a dynamic programming approach to simulate optimal strategies.

### Example Logic:
```java
newn[j][i] = max(
    n[i] + min(newn[j][i - 2], newn[j + 1][i - 1]),
    n[j] + min(newn[j + 2][i], newn[j + 1][i - 1])
);
```

---

## 🖼️ User Interface

- **Start Screen**: Fade-in welcome text and "Start Game" button
- **Input Method Selection**: Choose how to insert numbers (manual, file, or random)
- **Input View**: Enter the sequence, range, or upload a file
- **Gameplay**: Displays turn logic and results, with transition effects and visual feedback

---

## 🛠️ Technologies Used

- **Java (OOP, Collections, File I/O)**
- **JavaFX** for GUI
- **Algorithmic Logic** using nested matrices and dynamic programming
- **Event Handling** and scene transitions for interactive flow

---

## 📁 Project Structure

```
DynamicGame/
├── Algorethm/
│   ├── Start.java          # Intro screen with animation
│   ├── input.java          # Entry point for mode selection
│   ├── Number.java         # Handles all user input screens
│   ├── Dynamic_game.java   # Core DP logic and gameplay
```

---

## 🌟 Why This Project Stands Out

- Combines **advanced algorithms** with **interactive GUI development**.
- Demonstrates deep understanding of **game theory**, **state management**, and **dynamic programming**.
- Full-stack JavaFX application with smooth transitions and event-driven logic.
- Emphasizes clean code structure and modular design — ready for enhancement or integration.

---









![image](https://github.com/user-attachments/assets/ae0200fb-930f-4947-94bc-b2fd28b7144b)

![image](https://github.com/user-attachments/assets/500d24ff-0d2c-4217-a04c-1c5e81c04e2c)

![image](https://github.com/user-attachments/assets/7d383f1e-7327-42d7-bfbb-4e46bf8c3b28)

![image](https://github.com/user-attachments/assets/83ebc3f7-f423-49f1-8081-06df86c75aac)

![image](https://github.com/user-attachments/assets/971a9e7c-74d0-4be2-8561-df702fe77182)
