## Overloading: Method Choice and the Effects of Autoboxing
 
So, if you are considering being an accommodating software developer what things should you consider when setting up your overloaded methods? `Autoboxing`.
 
### What is `Autoboxing`?

`Autoboxing` is when Java uses the wrapper class's `valueOf()` method, behind the scenes, to create the wrapper Object.

Great, what's a wrapper class?  A wrapper class is simply the corresponding Reference type variable of the Primitive type.

Let's look at some examples, see [AutoboxingTest.java](https://github.com/robrides/methodoverloading/blob/master/resources/Autoboxing.java)

```
Integer integerObject = new Integer(2_000);
int i = 100;

integerObject = i; // Autoboxing of primitive int to wrapper class Integer
System.out.println("Value of integerObject after autoboxing of int: " + integerObject);

i = 200;

integerObject = Integer.valueOf(i); // Manual boxing of primitive int to wrapper class Integer
System.out.println(integerObject);

Long longObject = new Long(10_000);
long longPrim = 0;

longObject = longPrim; // Autoboxing of primitive long to wrapper class Long
System.out.println("Value of longObject after autoboxing of long: " + longObject + " Class: "
		+ longObject.getClass().getSimpleName()); 

longPrim = i; // This is promotion from int to long, not autoboxing
System.out.println("Value of longPrim int promotion: " + longPrim);
```

### Type Promotion
When a data type of a smaller size is promoted to the data type of a bigger size this is called type promotion. 

* Data types on the left can be promoted to the type on the right.
  * byte → short → int → long
  * short → int → long
  * int → long → float → double
  * float → double
  * long → float → double

### Method Choice and effects of Autoboxing
When choosing how to construct a method, consideration for flexibility is the mark of a knowledgeable software developer.  Building methods that can take advantage of `Autoboxing` reflects a more thorough understanding of Java.  Ensure there are overloaded methods which can handle a range of datatypes. Let's look at more examples to better explain. See [OverloadingTest.java](https://github.com/robrides/methodoverloading/blob/master/resources/OverloadingTest.java).

### Summary
Overloading and overriding are two separate concepts.  Overriding is an example of polymorphism, overloading is not. A knowledgeable and accommodating Java developer will ensure a class has a range of methods that take advantage of `Autoboxing` to handle the varying needs of callers. However, according to The Java Tutorials, while, "Autoboxing and unboxing lets developers write cleaner code, making it easier to read," it also says, "overloaded methods should be used sparingly, as they can make code much less readable."

#### Resources
* [Autoboxing.java](https://github.com/robrides/methodoverloading/blob/master/Autoboxing.java)
* [Beginnersbook.com](https://beginnersbook.com/2013/05/method-overloading/)
* [The Java Tutorials, Autoboxing](https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html)
* [The Java Tutorials, Overloading Methods](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
* [Skill Distillery Autoboxing](https://github.com/SkillDistillery/SD20/blob/7d7ad4f8492a7f11c41cdffac77b6d5791927be2/java1/WrapperClasses/autoboxing.md)
* [OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide: Exam 1Z0-808](https://www.oreilly.com/library/view/oca-oracle-certified/9781118957424/)
* [Head First Java, 2nd Edition](https://www.oreilly.com/library/view/head-first-java/0596009208/)

<hr>

[Up](../master/README.md) | [Prev](https://github.com/robrides/methodoverloading/blob/master/overloadingRules.md) | [Next](https://github.com/robrides/methodoverloading/blob/master/sampleQuestion.md) 