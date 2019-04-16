## Overloading ...continued

Overloading is nothing more than having two methods in the same class with the same name but different arguments.

> #### Pop Quiz...
>Is overloading an example of inheritance or polymorphism?

```


















```
> #### ...Answer
>**It's a trick question...it's not an example of either!**.  
It is just a different method that happens to have the same name but different argument lists.  
_Head First Java_

## Overloading: _The Rules_

Now that you know the difference between overloading and overriding, let's cover the rules for overloading.

### Do's...
* The return types can be different.
  * Return types can change as long as the arguments are different.
* Access modifier can be different.
  * You can make the overloaded method more or less restrictive as you are not fullfilling a contract in overloading of methods.

### Don'ts...
* You _can't_ change **ONLY** the return type.
  * The compiler will assume you are trying to override the method which isn't legal unless the return type is a subtype of the return type declared in the superclass.
* You _can't_ have two methods with the same name and same parameters. 
  * This will not compile.  Changing the order of the parameters, which changes the method signature, is allowed.

### Must...
You **must** change the parameters and you _can_ change the return type.
  
#### Resources
* [Programcreek.com](https://www.programcreek.com/2009/02/overriding-and-overloading-in-java-with-examples/)
* [OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide: Exam 1Z0-808](https://www.oreilly.com/library/view/oca-oracle-certified/9781118957424/)
* [Head First Java, 2nd Edition](https://www.oreilly.com/library/view/head-first-java/0596009208/)

<hr>

[Up](../master/README.md) | [Prev](https://github.com/robrides/methodoverloading/blob/master/overloadOverride.md) | [Next](https://github.com/robrides/methodoverloading/blob/master/overloadMethodChoiceAutoboxing.md)