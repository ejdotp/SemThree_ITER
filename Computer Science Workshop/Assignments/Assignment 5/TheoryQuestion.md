# Theory Part:
- Explain the following concepts:
    + Wrapper Class
        - Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
    + Need for the wrapper class
        -  It is because of the additional features being there in the Wrapper class over the primitive data types when it comes to usage. These methods include primarily methods like valueOf(), parseInt(), toString(), and many more. A wrapper class wraps (encloses) around a data type and gives it an object appearance. Wrapper classes are final and immutable.
    + Different techniques of wrapping
        - A variety of methods are available in wrapper classes that make it easier to manipulate and retrieve data. Working with basic data types as though they were objects is made simpler by these approaches. The following are some typical operations that wrapper classes support:
            + 'intValue()': Returns the wrapper object's value as an 'int'.
            + "doubleValue()": Returns the wrapper object's value in the form of a "double."
            + 'toString()': Turns the wrapper object into a string.
            + "equals(Object obj)": Determines whether the supplied object and the wrapped object are equal.
            + "compareTo(T anotherObject)" compares the wrapper object to another object and returns a positive value if the comparison is successful and a negative value otherwise.
        - These methods make it more straightforward to control information and change type in Java, which works on the lucidness and viability of the code.
    + Autoboxing
    + Unboxing
- Explain the concept of converting a base data type to an object type(Wrapping) using the valueOf() method.
    + It is a static method that allows you to create an object of the respective wrapper class from a specified primitive value.
- Explain the concept of converting object type to base type.
    + In Java, converting an object of a derived class to its base class type is known as "upcasting." This involves treating an instance of a subclass as an instance of its superclass.
- Explain the method used to do so.
    + It's implicitly done when you assign an object of the derived class to a reference variable of the base class type. Upcasting is safe because a subclass object inherently contains all the characteristics of its superclass.
