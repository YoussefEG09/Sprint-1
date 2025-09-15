# Java Object-Oriented Programming Exercises

📁 Contents

Musical Instruments Hierarchy

Car Class with Static Members

Phone and Smartphone with Interfaces

Sports News Management System

1. 🎼 Musical Instruments Hierarchy

✔️ Objective:
Create an abstract Instruments class and extend it with Strings, Wind, and Percussion classes, each overriding the play() method.

📂 Files:

Instruments.java

Strings.java

Wind.java

Percussion.java

Main.java

💡 What it demonstrates:

Abstract classes and methods

Inheritance and method overriding

Basic validation and exception handling

2. 🚗 Car Class with Static Members

✔️ Objective:
Implement a Car class showing the difference between static and instance attributes, including static and non-static methods like brake() and accelerate().

📂 Files:

Car.java

Main.java

💡 What it demonstrates:

Static vs instance variables and methods

Use of final and static final fields

Constructor initialization

3. 📱 Phone and Smartphone with Interfaces

✔️ Objective:
Simulate a Phone class extended by Smartphone, which implements two interfaces: Camera and Watch.

📂 Files:

Phone.java

Smartphone.java

Camera.java

Watch.java

Main.java

💡 What it demonstrates:

Class inheritance

Implementation of multiple interfaces

Polymorphism via methods like call(), photograph(), and alarm()

4. ⚽ Sports News Management System (Main Project)

✔️ Objective:
Create an abstract SportsNews class with multiple sport-specific subclasses (Soccer, Basket, Tennis, Motorbike, F1), and a Writer class managing news articles.

📂 Files:

SportsNews.java (abstract)

Soccer.java

Basket.java

Tennis.java

Motorbike.java

F1.java

Writer.java

Menu.java

Main.java

💡 What it demonstrates:

Advanced inheritance and polymorphism

Abstract methods and overriding

Use of collections (ArrayList) to manage related objects

Static members in classes

Basic console UI through a menu system

Encapsulation and validation

Calculation logic for news price and score based on attributes

🚀 How to Run

Compile all .java files.

Run the Main class in Level3_TascaS1.

Use the console menu to manage writers and their sports news articles:

Add/remove writers

Add/remove news articles

List articles per writer

Calculate scores and prices

📝 Notes

Menu system is partially implemented and can be extended.

Some methods like deleteNews in Writer class need fixing (currently adds instead of removes).

Input validation is minimal; further improvements recommended.

Designed as an educational project illustrating OOP principles.

🌟 Future Enhancements

Complete the menu and its functionalities.

Add persistent storage (files or database).

Implement comprehensive input validation and error handling.

Include unit tests for robustness.

Build a GUI interface for better user experience.
