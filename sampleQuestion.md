## Sample Overloading Question

>### Which of the following are true statements about the following code? (Choose all that apply)
>4: List<Integer> ages = new ArrayList<>();  
>5: ages.add(Integer.parseInt("5"));  
>6: ages.add(Integer.valueOf("6"));  
>7: ages.add(7);  
>8: ages.add(null);  
>9: for (int age : ages) System.out.print(age);  

>A. The code compiles.  
>B. The code throws a runtime exception.  
>C. Exactly one of the add statements uses autoboxing.  
>D. Exactly two of the add statements uses autoboxing.  
>E. Exactly three of the add statements uses autoboxing.  

```





















```
> ### SOLUTIONS
A, B, D.
Lines 5 and 7 use autoboxing to convert an int to an Integer. Line 6 does not because valueOf() returns an Integer. Line 8 does not because null is not an int. The code does compile. However, when the for loop tries to unbox null into an int, it fails and throws a NullPointerException.

#### Resources
* [OCA: Oracle Certified Associate Java SE 8 Programmer I Study Guide: Exam 1Z0-808](https://www.oreilly.com/library/view/oca-oracle-certified/9781118957424/)
* [Crystal Clear](https://www.youtube.com/watch?v=KmKOVdAGtzM)

<hr>

[Up](../master/README.md) | [Prev](https://github.com/robrides/methodoverloading/blob/master/overloadMethodChoiceAutoboxing.md)
