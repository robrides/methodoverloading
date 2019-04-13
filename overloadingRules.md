## Overloading ...continued

Overloading is nothing more than having two methods with the same name but different arguments.

Is overloading an example of inheritance or polymorphism?

```
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
.
```

No, it's not an example of either.  it is just a different method that happens to have the same name.

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
  * You **must** change the parameters and you _can_ change the return type.
  
  
<hr>

[Up](../master/README.md) | [Prev](https://github.com/robrides/methodoverloading/blob/master/overloadOverride.md) | [Next](https://github.com/robrides/methodoverloading/blob/master/overloadMethodChoiceAutoboxing.md)