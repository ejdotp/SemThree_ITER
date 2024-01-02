# Principles of oop in java
-> IS-A : when one object belongs to a particular class(inheritance)  
-> HAS-A  
> example:
Dog->Animal->Living Being(super class)
Dog "IS-A" animal.
Dog "HAS-A" tail.

1. Abstraction:  
    - Reveal - what you need to show  
    + Hide - what you don't need to show  
1. Encapsulation:
    * Different objects, methods, variables; they all bind to one class to perform a task  
1. Polymorphism:
    * poly -> more than two
    + morphism -> quality/state/forms  
1. Inheritance:  
    - Copying and changing little bit to form a new.
1. Declaration Rules
    - Only one public class per source code file is permitted
    - Comments can appear anywhere, beginning or end. 
    - Name of the source code file must match the name of the public class and end with “.java”. For example, in our HelloWorldExample, we have HelloWorldExample as our public class and hence the file name must be  
        HelloWorldExample.java.
    - Although it is not mandatory to create separate packages, it is a good practice to create separate ones. In that case, package declaration must be the first line even before import statements.
    - For any imports, import keyword must be used followed by the class full path. And these statements must appear between package declaration and class declaration.
    - There can be multiple class declarations but only one class can be classified as public. Hence, these import and package statements are applicable to all the packages and imports.
    - A file which contains the program with no public class can have any name that does not need to match any of the classes in the fil e. Only public class name must match with the file name and a file can have only one public class.
1. Identifier:
    - It must not start with a number.
    - It should not have space between two words.
         - Variables, objects, class name, function.
