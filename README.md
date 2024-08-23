# Library Management System
A Java-based Library Management System designed to handle book inventories, user management, and borrowing functionalities. This project is structured with a Main.java entry point and a modular approach in the src directory.

## Overview
This Library Management System is a Java application that allows for managing a library's book inventory, user accounts, and borrowing/returning of books. The project is designed to be modular and easy to extend.

## Project Structure
```sh
LibraryManagementSystem/
|-- src/
|   |-- library/
|       |-- booklist/
|           |-- Book.java
|           |-- BookList.java
|       |-- memberlist/
|           |-- Member.java
|           |-- MemberList.java
|       |-- transactionlist/
|           |-- Transaction.java
|           |-- TransactionList.java
|    |-- Main.java
|-- bin/ (for the .class files)

```


## Features
- Add new books to the inventory
- Register new users
- Borrow and return books
- Search for books by title, author, or Book ID

## Getting Started
### Prerequisites
- Java Development Kit (JDK) installed on your machine

### Running the Application
1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/LibraryManagementSystem.git
    ```
2. Navigate to the project directory:
    ```sh
    cd LibraryManagementSystem
    ```
3. Compile the Java files:
    ```sh
    javac Main.java
    ```
4. Run the application:
    ```sh
    java Main
    ```
### Note:
1. If `.class` files are not ready, compile the Java files:
    ```sh
    javac -d bin src/library/booklist/*.java src/library/memberlist/*.java src/library/transactionlist/*.java src/Main.java
    ```
2. Run the application:
    ```sh
    java -cp bin Main
    ```
   


