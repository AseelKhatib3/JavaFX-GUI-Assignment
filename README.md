# 🎨 JavaFX GUI Text Styler

This project is an interactive **JavaFX GUI application** that allows users to fully style and control text on the screen.  
The application demonstrates clean GUI structuring, event handling, component modularization, and dynamic styling using JavaFX.

---

## ✨ Features

✔ Change text color (via **Radio Buttons**)  
✔ Select color from a **ComboBox**  
✔ Change font size dynamically  
✔ Apply **Bold** or **Italic** styles  
✔ Move the text in 4 directions using arrow buttons  
✔ Clean UI with organized regions (Top, Bottom, Left, Right, Center)  
✔ Fully object-oriented design — each GUI section is its own class  

---

## 🧱 Project Structure

The project is divided into separate reusable JavaFX components:

### **`Main.java`**
- Builds the main layout using `BorderPane`
- Connects all GUI components together
- Handles all event listeners (color changes, movement, font size, bold/italic, combo box)
- Displays the styled text in the center pane

---

### **`topClass.java`**
A horizontal bar that contains:
- A label: *“Enter the font size:”*
- A text field to input font size  
- Updates the text size dynamically when typing

---

### **`leftClass.java`**
Vertical sidebar that contains:
- RadioButtons for selecting color  
  - 🔴 Red  
  - 🟢 Green  
  - 🔵 Blue  
- Handles color selection and applies it to the main text

---

### **`comboClass.java`**
Contains a **ComboBox** with the same color options:
- Red  
- Green  
- Blue  
Selecting a color updates the text immediately.

---

### **`rightClass.java`**
Contains two large styled CheckBoxes:
- **Bold**  
- **Italic**  
Ensures that only one can be active at a time.

---

### **`gridPaneClass.java`**
A section at the bottom containing arrow-image buttons:
- ⬅️ Left  
- ➡️ Right  
- ⬆️ Up  
- ⬇️ Down  

Pressing these buttons moves the text inside the center pane.

---

## 🚀 How to Run the Project

1. **Clone or download this repository**
   ```bash
   git clone https://github.com/USERNAME/REPOSITORY.git


---

## 🖼️ Screenshot

Below is an example of how the interface looks:

![App Screenshot](Screenshot.png)

---

## 🎬 Demo Video

Watch a full walkthrough of the app showcasing all user roles and features:

👉 [Click here to watch the demo](https://github.com/username/repo/releases/download/v1.0/ScreenRecording.mov)


---

## 👩‍💻 Developed By  
**Aseel Khatib**

---
