# Principles of OOPS in java

-> IS-A : when one object belongs to a particular class(inheritance)  
-> HAS-A

> example:  
> Dog->Animal->Living Being(super class)  
> Dog "IS-A" animal.  
> Dog "HAS-A" tail.  

+ ### Abstraction:


  1. Reveal - what you need to show
  2. Hide - what you don't need to show
+ ### Encapsulation:


  * Different objects, methods, variables; they all bind to one class to perform a task
+ ### Polymorphism:


  * poly -> more than two

  + morphism -> quality/state/forms
+ ### Inheritance:


  - Copying and changing little bit to form a new.
+ ### Declaration Rules


  1. Only one public class per source code file is permitted
  2. Comments can appear anywhere, beginning or end.
  3. Name of the source code file must match the name of the public class and end with “.java”. For example, in our HelloWorldExample, we have HelloWorldExample as our public class and hence the file name must be:
     > HelloWorldExample.java
     >
  4. Although it is not mandatory to create separate packages, it is a good practice to create separate ones. In that case, package declaration must be the first line even before import statements.
  5. For any imports, import keyword must be used followed by the class full path. And these statements must appear between package declaration and class declaration.
  6. There can be multiple class declarations but only one class can be classified as public. Hence, these import and package statements are applicable to all the packages and imports.
  7. A file which contains the program with no public class can have any name that does not need to match any of the classes in the fil e. Only public class name must match with the file name and a file can have only one public class.
+ ### Identifier:


  1. It must not start with a number.
  2. It should not have space between two words.
     - Variables, objects, class name, function.
+ ### Dude is Case Sensitive


  - 'Program' and 'program' are two different words for java but same for html.
+ ### Class Levels ( Accessibility )

<pre>
                ↑               |  
                |  Private      |  
    More        |  Default      |  Less  
    Restricted  |  Protected    |  Restricted  
                |  Public       ↓  </pre>

+ ### Basic Syntax:
  - Every line of the code should be inside a class  
  - Class name should start with an upercase letter [not compulsory]
  - Every Java program should have main method/function
    >Test.java
    - <pre>public class Test{
        public static void main(string[] args){      |
        --1--- -----2----- -3-- ------4------        |
          System.out.println("Hello World");         |5
        }                                            |
      }
        
        1-> Access Modifier
        2-> Return Type
        3-> Function/Method
        4-> Parameters
        5-> Body of the code</pre>

+ ### Variables:
  - They are a container to store values.
     > int Var
    + is a container that store integer values.
  - Types of variables in java are:
    - Primitives : byte , short , int , long , float , double , char, boolean
  - Declaration:
     >Vartype varname = value;

+ ### Test.java:
  - <pre>  public class Test
      {  
          public static void main(String[] args)
          {  
              String x="ABCDEFGHIJKLMNOPQRSTUVWXYZ";  
              int y=x.length();  
              String z=x.toLowerCase();  
              System.out.println(y);  
              System.out.println(z);  
              System.out.println(z.toUpperCase());  
              String fname="Rahul";  
              String lname=" Mohanty";  
              String Name=fname.concat(lname);  
              System.out.println(Name);  
              System.out.println("We are "Section44" of "CSE");  
              System.out.println("We are \Section44\ of CSE");  
              System.out.println(c.indexOf("word"));  
              Syatem.out.println(c.indexOf("word"));  
              String[] w={"I", "Me", "Myself"};  
              String[] V={" an", "here"};  
              int[] i={10,20,21};  
              System.out.println(w[0].concat(v[0])+" "+i[1]);  
              for (String j:w)  
                  System.out.println(j);  
          }  
      }</pre>

+ ### Multi-Dimentional Array:
  - An array can contain another arrays which makes it multidimensional.
  - 2D Array: 
    - <pre>public class MultiDimentionalArray
      {
        public static void main(String[] args)
        {
            int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
            System.out.println(numbers[1][2]);
            int k = numbers[2][2];
            System.out.println(k);
            numbers[2][1] = 10;
            System.out.println(numbers[2][1]);
        }
      }</pre>
    
    - here, 'numbers.length' will give the row length and 'numbers[0].length' will give the column length.

  
