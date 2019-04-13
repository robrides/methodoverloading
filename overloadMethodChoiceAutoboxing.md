## Overloading: Method Choice and the Effects of Autoboxing
 
So, if you are considering being an accommodating software developer what things should you consider when setting up your overloaded methods? `Autoboxing`.
 
### What is `Autoboxing`?

Autoboxing is when Java uses the wrapper class's `valueOf()` method to create the wrapper object.

Great, what's a wrapper class?  A wrapper class is simply the object version of the primitive type.

Examples:

```
Integer integerObject = new Integer(0);
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

>### Type Promotion
>#### When a data type of smaller size is promoted to the data type of bigger size than this is called type promotion, for example: byte data type can be promoted to short, a short data type can be promoted to int, long, double etc.

>Data types on the left can be promoted to the type on the right.

>byte → short → int → long
short → int → long
int → long → float → double
float → double
long → float → double

#### Resources
#### Resources
* [Beginnersbook.com](https://beginnersbook.com/2013/05/method-overloading/)
* [Programcreek.com](https://www.programcreek.com/2009/02/overriding-and-overloading-in-java-with-examples/)
* [Skill Distillery](https://github.com/SkillDistillery/SD20/blob/07b4bda901353004c384bd88cf5c5837240d9962/jfop/Methods/parameters2.md)
* [Skill Distillery Autoboxing](https://github.com/SkillDistillery/SD20/blob/7d7ad4f8492a7f11c41cdffac77b6d5791927be2/java1/WrapperClasses/autoboxing.md)
* [OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide: Exam 1Z0-808](https://www.oreilly.com/library/view/oca-oracle-certified/9781118957424/)
* [Head First Java, 2nd Edition](https://www.oreilly.com/library/view/head-first-java/0596009208/)
* [Crystal Clear](https://www.youtube.com/watch?v=KmKOVdAGtzM)

<hr>

[Up](../master/README.md) | [Prev](https://github.com/robrides/methodoverloading/blob/master/overloadingRules.md) 