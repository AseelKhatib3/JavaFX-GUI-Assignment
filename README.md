# JavaFX GUI Assignment — Text Styler & Controller

Interactive JavaFX desktop application that allows users to style and move text in real-time.  
The app demonstrates modular JavaFX components, dynamic font control, color selection, style toggles, and directional movement controls — ideal as a university assignment or demo project.

---

## 🚀 Features

- Dynamic font-size input (live updates while typing)
- Color selection via radio buttons and combo box
- Bold / Italic toggles (mutually exclusive behaviour in UI logic)
- Directional arrow controls for moving the text (up/down/left/right)
- Modular code organisation — separate classes for top, left, right panels and grid controls
- Easy-to-run desktop JavaFX application

---

## 🧭 How it works (high level)

The application UI is composed of modular components:

- `topClass` — contains the font-size input and its layout.
- `leftClass` — radio buttons for color selection.
- `comboClass` — a ComboBox color selector.
- `rightClass` — Bold / Italic checkboxes (toggle effect handled in the main controller).
- `gridPaneClass` — arrow buttons arranged in a grid to move the text; includes a `TextArea` for messages.
- `Main` — composes all components into a `BorderPane`, wires event handlers, and controls the `Text` node.

**Key UI behaviour (what the code does):**
- When the user types a number in the font-size field, the `Text` font is updated live.
- Selecting a color from either the radio buttons or the combo box sets the `Text` color (the combo box clears the radio selection and vice versa).
- Bold and Italic checkboxes set the `Text` font weight or posture, and unselect the opposite style when chosen.
- Arrow buttons call simple handlers that change `text.setX(...)` and `text.setY(...)` to move the displayed text on the pane.

---

## 🧠 About the "Dynamic" explanation (if you previously implemented DP)

If you also included dynamic programming logic (e.g., for a different assignment in the same repo), explain it like this in the README:

**Dynamic Programming Overview**  
This repository demonstrates an algorithmic solution to an optimization problem using Dynamic Programming. The approach used:

1. **Problem modelling** — Represent the problem state(s) as an indexable structure (e.g., matrix or array).  
2. **Transition relation** — For each state `i, j` compute the best value using previously computed states (for example, Floyd–Warshall updates `cost[i][j] = min(cost[i][j], cost[i][k] + cost[k][j])`).  
3. **Table reconstruction** — Keep a `next` or `parent` table for reconstructing the actual optimal route after the DP values are computed.  
4. **Complexity** — Provide the time/space complexity (for Floyd–Warshall it's `O(N^3)` time and `O(N^2)` space).  
5. **Output** — The program prints the optimal solution, alternative paths, and shows the full DP table.

(If you want, I can merge your actual DP files and give a tailored explanation referencing the exact class and method names used.)

---

## 🛠 Technologies & Tools

- **Java** (JDK 8+ or 11+ recommended)
- **JavaFX** (matching your JDK version — if using modular Java, set the module path or use an SDK that bundles JavaFX)
- IDE: **Eclipse / IntelliJ / VS Code**
- Build (optional): Maven / Gradle (not required, project runs from IDE)

---

## ▶️ How to run

### Option A — Run from your IDE (recommended)
1. Open the project folder in your IDE (File → Open → select repository folder).
2. Make sure JavaFX libraries are available (set JDK / module path according to your setup).
3. Run `application.Main` (right-click → Run as Java Application).

### Option B — Command line (assuming JavaFX setup and JDK installed)
> This depends on your JavaFX distribution. If you're using a modular JavaFX SDK, include `--module-path` and `--add-modules javafx.controls,javafx.fxml`.

Example (not modular):
```bash
# From project root
javac -cp "path/to/javafx-sdk/lib/*" -d bin $(find src -name "*.java")
java -cp "bin:path/to/javafx-sdk/lib/*" application.Main

---

## 🔥 Demo / Screenshot

**Live demo (quick view)**: run the `Main` class in your IDE (Eclipse / IntelliJ / VS Code with JavaFX setup) to open the GUI.

**Main screenshot** (included in the repository as `screen1.png`):

![App Screenshot](./screen1.png)

---
✨ **Developed by Aseel Khatib**


