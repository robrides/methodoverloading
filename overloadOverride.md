## Overload vs Override

Overriding and Overloading are two very important concepts in Java. However, they are mildly _confusing_ for Java `novice` programmers.
>_programcreek.com_ 

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
 
  * The name of the method, along with its list of parameter datatypes, in order, is termed the method's _signature_.  
  * The compiler does not consider return type when differentiating methods, so you cannot declare two methods with the same signature even if they have a different return type.

> #### signature
> A method's name and list of parameter datatypes.  
_Skill Distillery_  
_[The Java Tutorials](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)_

![OCA Java SE 8 Programmer I Study Guide, Figure 4.1](https://github.com/robrides/methodoverloading/blob/master/OCAStudyGuideFig4.1.jpg)
OCA Java SE 8 Programmer I Study Guide, Figure 4.1

### What constitutes...
 * **Overloading**
   * _"Overloading occurs when two or more methods in one class have the same method name but different parameters."_
   * _"Overloading lets you make multiple versions of a method for convenience to the caller."_
 * **Overriding**
   * _"Overriding means having two methods with the same method name and parameters (i.e., method signature). One of the methods is in the parent class and the other is in the child class. Overriding allows a child class to provide a specific implementation of a method that is already provided in its parent class._"

>programmcreek.com

### Discussion

Imagine `StringBuilder` had only one version of its `append()` method.  You would have to convert everything you wanted to append to a `StringBuilder` to a String first, before calling `append()`.  That would be horrible.  A more _accommodating_ software developer would have provided convenience in consuming their class, as did the developers of Java.  

Let's take a look at the [StringBuilder](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html) class.

Great, so what about overriding?  

Overriding happens in a parent class, child class relationship. The parent class has a method that does something general and the child class can override that method customizing the method to suit their needs.

Let's look at an example...

```
public class ModeOfTransportation {

	StringBuilder sb;
	String type;
	String color;
	String meansOfPropulsion;

	public ModeOfTransportation(String type, String color, String meansOfPropulsion) {
		this.type = type;
		this.color = color;
		this.meansOfPropulsion = meansOfPropulsion;
		sb = new StringBuilder();
	}

	public void move(int c, int i) {
		System.out.println("This " + getType() + " moves...");
		for (int j = 0; j < i; j++) {
			sb.append(Character.toChars(c));
			sb.appendCodePoint(128692);
		}
		System.out.println(sb.toString());
	}
}

public class Bicycle extends ModeOfTransportation {

	int numGears;
	
	public Bicycle(String color, int numGears) {
		super("Bicycle", color, "...by pedal power!");
		this.numGears = numGears;
	}
	
	@Override
	public void move(int c, int i) {
		super.move(c, i);
		System.out.println(getMeansOfPropulsion());
		System.out.println("This " + getType() + " has " 
				+ getNumGears() + " gears and a " + getColor() + "!");
	}
}
```
..._to the code_.

```











```

### Another example:

![Overloading vs Overriding](https://github.com/robrides/methodoverloading/blob/master/overloading-vs-overriding.png)
>_programcreek.com_ 

#### Resources
* [Programcreek.com](https://www.programcreek.com/2009/02/overriding-and-overloading-in-java-with-examples/)
* [Skill Distillery](https://github.com/SkillDistillery/SD20/blob/07b4bda901353004c384bd88cf5c5837240d9962/jfop/Methods/parameters2.md)
* [OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide: Exam 1Z0-808](https://www.oreilly.com/library/view/oca-oracle-certified/9781118957424/)
* [Head First Java, 2nd Edition](https://www.oreilly.com/library/view/head-first-java/0596009208/)

<hr>

[Up](../master/README.md) | [Next](https://github.com/robrides/methodoverloading/blob/master/overloadingRules.md)