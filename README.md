Design Patterns Project: Singleton & Abstract Factory
Description: Practical implementation of creational design patterns in Java to manage a global command history (Undo) and generate formatted international contacts.

📌 Exercise Statement
The project is divided into two main parts:

Singleton Pattern: Creation of an Undo class that ensures a single instance exists to manage a global command history across the entire application.

Abstract Factory Pattern: Design of a contact management system that automatically generates addresses and phone numbers formatted according to the country of origin (Spain and USA), decoupling the client code from concrete implementations.

✨ Features
Undo History (Singleton):

Add commands to a stack-based history.

Undo the last command (LIFO - Last In, First Out).

List the complete command history.

Global access point to the history from any part of the app.

International Contact Manager (Abstract Factory):

Automatic generation of phone numbers with international prefixes (+34 for Spain, +1 for USA).

Address formatting according to local postal standards.

Extensible architecture to add new countries (e.g., UK, Japan) without modifying existing client logic.

🛠 Technologies
Language: Java 17+

Build Tool: Maven / Gradle (Optional)

Testing: JUnit 5 (Jupiter)

🚀 Installation and Execution
Clone the repository:
git clone https://github.com/your-user/design-patterns-java.git

Import the project:
Open the root folder with your preferred IDE (IntelliJ IDEA, Eclipse, or VS Code).

App Execution:
Run the Main.java class located in src/main/java/.

Tests:
To run the unit tests, use the following command (if using Maven):
mvn test
Or right-click the test folder in your IDE and select "Run All Tests".


--- Abstract Factory Demo ---
Spain: Address: Carrer Major 34, 08001 Barcelona | Phone: +34 123456789
USA: Address: 154 5th Avenue, New York, NY 10001 | Phone: +1 987654321
🧩 Diagrams and Technical Decisions
Singleton
A Lazy Initialization approach was chosen to optimize memory usage, ensuring the instance is only created when first needed. 
The constructor is set to private to prevent external instantiation, and a static getInstance() method provides the global access point.

Abstract Factory
The Address and Phone interfaces were defined as Abstract Products to ensure all country variants implement the required formatting methods.
The Contact class (Client) only interacts with the ContactFactory interface, allowing the application to switch between country families (Spain, USA, etc.)
at runtime with minimal coupling.
