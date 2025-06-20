Exercise 2: Factory Method Pattern – Document Management System

Objective:
To implement a flexible document creation system using the Factory Method design pattern, supporting multiple types of documents such as Word, PDF, and Excel, while ensuring loose coupling and scalability.

Implementation Overview:

1. Document Interface:
   - Created a common interface 'Document' with a method 'open()'.
   - This allows all document types to follow a unified structure for usage.

2. Concrete Document Classes:
   - Implemented WordDocument, PdfDocument, and ExcelDocument classes.
   - Each class implements the 'Document' interface and overrides the 'open()' method to provide specific behavior.

3. Factory Method Structure:
   - Defined an abstract class 'DocumentFactory' with an abstract method 'createDocument()'.
   - Created concrete factory classes:
     - WordDocumentFactory
     - PdfDocumentFactory
     - ExcelDocumentFactory
   - Each factory encapsulates the creation logic of its respective document type.

4. Main Test Class:
   - The 'FactoryMain' class acts as the client and entry point.
   - Demonstrates the creation and usage of different document types through their respective factories.
   - Validates that each document is created via the factory pattern and behaves correctly.

Result:
The output shows the instantiation and opening of each document type using the factory method. This implementation ensures:
   - Modular design
   - Easy addition of new document types
   - Separation of concerns between creation and usage

Outcome:
Creating a Word document...
Opening Word document.

Creating a PDF document...
Opening PDF document.

Creating an Excel document...
Opening Excel document.

The program successfully demonstrates the Factory Method Pattern, achieving dynamic object creation and polymorphic behavior.
