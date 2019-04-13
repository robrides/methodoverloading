## Overload vs Override

"Overriding and Overloading are two very important concepts in Java. However, they are mildly _confusing_ for Java `novice` programmers." 

First, let's review some method basics.

* A method declaration has the following parts...
  * Access modifier (optional)
  * Specifier (optional)
  * Return type
  * Method name
  * Parenthesis
  * List of parameters in parenthesis (optional)
  * Exception declaration (optional)
  * Body 
 
Which of these make up the method signature?
 
The name of the method, along with its list of parameter datatypes, is termed the method's _signature_.

> #### signature
> A method's name and list of parameter datatypes.

### Definitions
 * Overloading
   * _"Overloading occurs when two or more methods in one class have the same method name but different parameters."_
   * _"Overloading lets you make multiple versions of a method for convenience to the caller."_
 * Overriding
   * _"Overriding means having two methods with the same method name and parameters (i.e., method signature). One of the methods is in the parent class and the other is in the child class. Overriding allows a child class to provide a specific implementation of a method that is already provided in its parent class._"

### Discussion

Imagine `StringBuilder` had only one version of its `append()` method.  You would have to convert everything you wanted to append to a `StringBuilder` to a String first, before calling `append()`.  That would be horrible.  A more accommodating software developer would have provided convenience in consuming their class, as did the developers of Java.  

Let's take a look at [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/class-use/StringBuilder.html).



Here are a few examples to illustrate the differences between overloading and overriding.

#### Resources
* [Programcreek.com](<a href="https://www.programcreek.com/2009/02/overriding-and-overloading-in-java-with-examples/" target="_blank"><a/>)
* [Skill Distillery](https://github.com/SkillDistillery/SD20/blob/07b4bda901353004c384bd88cf5c5837240d9962/jfop/Methods/parameters2.md)
* [Crytstal Clear](https://www.youtube.com/watch?v=KmKOVdAGtzM)