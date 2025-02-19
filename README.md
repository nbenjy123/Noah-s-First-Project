Personal Library Manager

📚 Overview

The Personal Library Manager is a Java-based console application that allows users to manage their personal book collection. Users can add, remove, list, and search for books. The data is persistently stored using file handling, ensuring books remain saved between sessions.

🛠 Features

Add a Book – Store book details (title, author, genre, year).

Remove a Book – Delete a book by its ID.

List All Books – Display all books in the collection.

Search Books – Find books by title or author.

Persistent Storage – Saves and loads books from a file (books.txt).

🏗 Technologies Used

Java – Core logic and object-oriented programming.

Collections API – Uses ArrayList for book storage.

File Handling – Saves and loads book data using serialization.

🚀 How to Run

Prerequisites

Ensure you have Java 8+ installed.

Steps to Run

Clone this repository:

git clone https://github.com/nbenjy123/PersonalLibraryManager.git
cd PersonalLibraryManager

Compile the Java files:

javac LibraryManager.java

Run the program:

java LibraryManager

📝 Usage

Run the program and follow the menu options.

Add books by entering details when prompted.

Remove books by entering their ID.

Search books using keywords.

Exit the program to save changes.


📁 PersonalLibraryManager
 ├── 📄 Book.java            (Represents a book)
 ├── 📄 Library.java         (Handles book collection)
 ├── 📄 LibraryManager.java  (Main menu and user interaction)
 ├── 📄 books.txt            (Storage file)
 ├── 📄 README.md            (Project description)

💡 Future Enhancements

Add a GUI version using JavaFX.

Implement sorting options (by title, year, author).

Use SQLite or MySQL instead of file storage.

🤝 Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss your ideas.

📜 License

This project is open-source under the MIT License.

