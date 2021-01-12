# stock_management_system
business / sales / inventory


Since I was young, I am interested in anything business-related. I was born in a Chinese family with business background and was introduced to commerce at an early age. Both of my parents and most of my relatives own businesses that were passed from generations to another.  When I was younger, I would go with my mom to the store during vacation and help sell stuff. This is the reason why when our CMSC 22 professor asked us to develop a project applying the basics of Java programming, Java design patterns, best practices in Java, and test-driven development that is our hobby or interests us, I didn’t hesitate to brainstorm on doing something that my mom and uncle may be able to use in the future. I noticed that our store doesn’t have an online stock management system. Everything is done manually or handwritten. This drove me to do this simple project that might help our store. 


-Java Design Patterns-
For Creational Pattern, I used Singleton Pattern. It is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools, configuration settings, etc. In my code, there is import java.util.logging.Logger; and you can see that I use logging after every catch statement. That is the class used to log application messages in Java Logging API. Its level is SEVERE and null since no information could be obtained. 

For Structural Pattern, I utilized Composite Pattern. One usage of Composite Pattern is when the responsibilities are needed to be added dynamically to the individual objects without affecting other objects... where the responsibility of objects may vary from time to time. It can be seen in the Add button. As you add objects, it doesn't affect other rows or other objects.

For Behavioral Pattern, I used Memento Pattern. These are mostly used in Undo and Redo operations in most software and also used in database transactions. The Stock Management System that I created has a database in SQL and Undo and Redo operations are evident in Edit and Cancel buttons in both Sales and Inventory. In Edit, you redo and in Cancel, you undo.


-Using Test-Driven Development (TDD)-
First, I add a test. Second, I run all tests and see if any new test fails. Upon seeing that some failed, the next thing that I did is I update the code and make the new tests pass. After that, I run the tests and they already passed.


-Java Best Practices that I practiced-
1. The source file length is lower than 2000 lines of code.
2. The names of the classes are not in shortcut form. 
3. In naming methods, names should be verbs.
4. Indentation is consistent.
5. The source file is organized with documentation comments, package declaration, followed by a class comment, imports group, and class interface signature.
6. Line length should be up to 70 to 120 characters depending on the effect of readability. 
7. One declaration per line is recommended. 
8. One (1) blank line between methods and two (2) blank lines after constructors, static block, fields, and inner class.
9. Space pad operators


IP Address (may be needed to access the SQL database):
172.20.10.4


Overview:
https://drive.google.com/drive/folders/1GzUoP_SXybpvEB6VqCV2xNqv5_NeAboe?usp=sharing
