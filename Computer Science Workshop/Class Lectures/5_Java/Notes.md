# Principles of oop in java
-> IS-A : when one object belongs to a particular class(inheritance)  
-> HAS-A  
> example:
Dog->Animal->Livong Being(super class)
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
1. 10.4.4 Declaration Rules

You have already seen how a sample program looks like. Now is the time to see rules that are applicable to source code file 

creation.

 1. Only one public class per source code file is permitted

 2. Comments can appear anywhere, beginning or end. 

 3. Name of the source code file must match the name of the public class and end with “.java”. For example, in 

our HelloWorldExample, we have HelloWorldExample as our public class and hence the file name must be 

HelloWorldExample.java.

 4. Although it is not mandatory to create separate packages, it is a good practice to create separate ones. In that case, 

package declaration must be the first line even before import statements.

 5. For any imports, import keyword must be used followed by the class full path. And these statements must appear 

between package declaration and class declaration.

 6. There can be multiple class declarations but only one class can be classified as public. Hence, these import and package 

statements are applicable to all the packages and imports.

 7. A file which contains the program with no public class can have any name that does not need to match any of the classes 

in the fil e. Only public class name must match with the file name and a file can have only one public class.
