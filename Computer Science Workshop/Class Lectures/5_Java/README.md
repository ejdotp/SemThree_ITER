# Principles of OOPS in java

-> IS-A : when one object belongs to a particular class(inheritance)-> HAS-A

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

    > Test.java
    >

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
    >

    + is a container that store integer values.
  - Types of variables in java are:

    - Primitives : byte , short , int , long , float , double , char, boolean
  - Declaration:

    > Vartype varname = value;
    >
+ ### Test.java:


  - <pre>public class Test
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
              String c="Find a word.";
              String Name=fname.concat(lname);
              System.out.println(Name);
              System.out.println("We are\\Section44\\ of CSE");
              System.out.println("We are \"Section44\" of CSE");
              System.out.println(c.indexOf("word"));
              System.out.println(c.indexOf("word"));
              String[] w={"I", "Me", "Myself"};
              String[] v={" an", "here"};
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
            int k = numbers[1][2];
            System.out.println(k);
            numbers[1][1] = 10;
            System.out.println(numbers[1][1]);
        }
      }</pre>
    - here, 'numbers.length' will give the row length and 'numbers[0].length' will give the column length.
+ ### Enums:


  - Special Class
    + Represents/Declares constants variables
  - It is used to define a group of related enumeration constants.
  - Syntax : enum Identifier{Constant}
  - Example :
    + <pre>enum level
      {
          LOW, MEDIUM, HIGH
      }
      public class EnumsClass
      {
          public static void main(String[] args)
          {
              level my_var1 = level.MEDIUM;
              System.out.println("Value of my_var1: " + my_var1);
              level my_var2 = level.LOW;
              System.out.println("Value of my_var2: " + my_var2);
              level my_var3 = level.HIGH;
              System.out.println("Value of my_var3: " + my_var3);
          }
      }</pre>
  - Enum in a Switch Statement:
    + Enums are often used in switch statements to check for corresponding values.
    + <pre>enum level
      {
          LOW, MEDIUM, HIGH
      }
      public class EnumSwitchCase
      {
          public static void main(String[] args)
          {
              level my_var1 = level.LOW;
              switch(my_var1)
              {
                  case LOW:
                      System.out.println("Low Level");
                      break;
                  case MEDIUM:
                      System.out.println("Medium Level");
                      break;
                  case HIGH:
                      System.out.println("High Level");
              }
          }
      }</pre>
  - Loop Through an Enum:
    + The enum type has a values() method, which returns an array of all enum constants. This method is useful when you want to loop through constants of an enum.
    + <pre>enum level
      {
          LOW, MEDIUM, HIGH, E_HIGH
      }
      public class EnumLoop
      {
          public static void main(String[] args) {
              for(level myvar:level.values())
              {
                  System.out.println(myvar);
              }
          }
      }</pre>
  - Difference between Enums & Classes:
    1. Enums are similar to classes.
    2. Enum constants are always `<b>`Public `</b>`,`<b>`Static `</b>`, and `<b>`Fixed `</b>`.
    3. An Enum can't be used to create objects.
  - Use of Enum:
    + Enums are used when the values aren't going to change, like:
      - Days of a week
      - Months
      - Colors of things
      - True Facts, etc.
+ ### Wrapper Classes:

  - Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
  - Primitive Data Types:

    + Data types, that has already been defined.
    + Examples: int, float, double, char, boolean.
    + Declaration: int m = 15;
  - The table below shows the primitive type and the equivalent wrapper class:  
    +  | Primitive Data Type | Wrapper Class |
       | ------------------- | ------------- |
       | byte                | Byte          |
       | short               | Short         |
       | int                 | Integer       |
       | long                | Long          |
       | float               | Float         |
       | double              | Double        |
       | boolean             | Boolean       |
       | char                | Character     |

  - Creation of Wrapper Class:

    + <pre>public class Test
      {
          public static void main(String[] args)
          {
              Integer my_Int = 15;
              Character my_char = 'x';
              Double my_Double = 17.231;
              System.out.println("Integer: " + my_Int);
              System.out.println("Character: " + my_char);
              System.out.println("Double: " + my_Double);
          }
      }

  - Functions: 
    + <pre>public class Functions
      {
          public static void main(String[] args)
          {
              Integer my_Int = 15;
              System.out.println(my_Int.intValue());
              String my_String = my_Int.toString();
              System.out.println(my_String);
              System.out.println("Length: "+my_String.length());
          }
      }
  
  - Autoboxing: 
    + The process of converting primitive data types to wrapper class objects.
  - Unboxing:
    + The process of converting wrapper class objects to primitive data types
     <pre>
                      --> Wrapper Class -------
                      |                       |
           Autoboxing |                       | Unboxing
                      |                       |
                      -- Primitive Datatypes <-
             * All done automatically by the compiler</pre>
  - write a program to check for prime (Application of Wrapper Class)
    <pre>public class isPrime
    {
        public static void main(String[] args)
        {
            int n = 29; //Input
            boolean flag = false;
            for (int i = 2; i <= n/2; i++)
            {
                if (n%i == 0)
                {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.println(n + " is a prime number.");
            else
                System.out.println(n + " is not a prime number.");
        }
    }</pre>
