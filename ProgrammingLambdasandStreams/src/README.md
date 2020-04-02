## Expression & Statements blocks
Expression consists of variable, operators and Literals. 
???



## GENERICS
Java Generics are invariant. Example if a method accepts List<Number> we cannot
pass List<Integer> to the method.<br>

reference variable have two types of information. One is type of reference variable
and the generics it holds. The generic information is compile time only. 

Generics is associated with the variable and not the object.

__Reason:__
-   List<Integer> listnum = new ArrayList<>();
-   List liobject = listnum;
Above statements are legal, we can add objects to liobject. lets say we are iterating
List of Integer through objects added can cause class cast exception. 

what does List< ? extends Number> mean: 
Number is the upper limit. and you pass List of Integer, Double, Float, Number to the methods.
you cannot add elements to the collection with extends because if you adding integer, it could be of list Double or float.


 
```java
    interface Collection<E>{
  public boolean addAll(Collection< ? extends E> c);
  }
/* 
? extends E" E is the upper limit 
you can add any elements of type E or any subtype. 

*/
  ```
 

  
  
  
  
## Object Ordering
A list l may be sorted as follows 
   `Collections.sort(l)` 
   
if the list consists of a string elements, it will be sorted by alphabetical order. if it 
consists of Date elements, it will be sorted into chronological order. How does this happen ? they 
both implement the **Comparable**. __Comparable implementations provide
a natural ordering for a class.__,which allows objects of that class 
to be sorted automatically. The following table summarizes some of more 
important java classes that implement Comparable. 
 
## Lambda Expression

They let you represent a behaviour or passcode in concise way.
A lambda expression can be understood as a concise representation of an 
anonymous function the can be passed around. 
 
Lambda Expression == anonymous functions, methods without declared names
Signature of the abstract method of the functional interface 
describes the lambda expression. 

Abstract method in functional interface is a function descriptor

## TYPE CHECKING, TYPE INFERENCE, AND RESTRICTIONS


## Comparator
## Functions

`package java.util.Function`
  
## Predicate

```java
package java.util.function.Predicate<T>;
/* Interface */
@FunctionalInterface

public interface Predicate<T>{
 Boolean test(T t);
}
```

## Consumer
Consumer interface defines an abstract method named accept
that takes an object of generic type and return void. 

```java
import java.util.function.Consumer;
@FunctionalInterface
public interface Consumer<T>{
    
}
```

## Function
interface defines an abstract method named apply that takes an object of generic type T 
as input and returns R. 
```java
@FunctionalInterface
public interface Function<T, R>{

}
```
##STREAM 
Lazily evaluated
Internal iteration
Multithreaded optimization by compiler

## FILTERING STREAM
> Filtering with Predicate
Stream interface has filter method
```java 
import java.util.stream.Stream;2
Stream<T> filter(Predicate<? super T>)
```
> Filtering Unique Elements

```java 
import java.util.stream.Stream
Stream<T> distinct()`
```

## SLICING A STREAM

> Slicing using Predicate "takeWhile" and "dropWhile"

Java 9 new default method in Stream interface "takeWhile" returns Stream<T>. 
Takes Predicate as the input
```java
/* default takeWhile(Predicate< ? super T> predicate){
}
*/
```

> Truncating a Stream "limit(n)"
> Skipping a Stream "skip(n)"


## Mapping a Stream
map Method takes function as an arguement. 
This function is __apply__ to each element of the stream, mapping it to new element 

> stream().map(Function<T,R> mapper)
>return Stream<R> 

> Question: Given a list of words return list of number of characters in each word
```java 
import java.util.List;
import java.util.ArrayList; 
import java.util.Collectors;
List<String> words = Arrays.asList("Modern","Java","in","action") 
words.stream()
    .map(String::length)
    .collect(toList())
```

## Flattening Streams
Applying a Function to each element of the stream. <br>


| __OPERATION__ | __TYPE__ | __RETURN TYPE__ | __FUNCTIONAL INTERFACE REQUIRED__ | __FUNCTION DESCRIPTOR__ |
|---------:|----:|-----------:|-----------------------------------:|--------------------:|
|filter |Intermediate | Stream<T> | Predicate<T> | T -> boolean |
|distinct |Intermediate | Stream<T> |           |               |
|takeWhile| Intermediate |Stream<T> | Predicate<T>| T -> boolean|
|dropWhile| Intermediate | Stream<T> | Predicate<T>| T -> boolean|
|skip|intermediate|Stream<T>|long  |  |
|limit|intermediate|Stream<T>|long | |
|map|intermediate|Stream<R>|Function<T,R>|T -> R |
|flatmap|intermediate|Stream<R>|Function<T,Stream<R>>|T -> Stream<R>|
|Sorted|intermediate|Stream<T>|Comparator<T>|(T,T) -> int|
|anyMatch|terminal|boolean|Predicate<T>|T -> boolean|
|noneMatch|terminal|boolean|Predicate<T>| T -> boolean
|allMatch|terminal|boolean|Predicate<T>| T -> boolean
|findAny|terminal|Optional<T>| 
|findFirst|terminal|Optional<T>|
|forEach|terminal|void|Consumer<T>| T -> void
|collect|terminal|R|Collector<T,A,R>|
|reduce|terminal(stateful)|Optional<T>|BinaryOperator<T>|(T,T) -> T

## FINDING AND MATCHING
The Stream API provides additional facilites `allMatch` `anyMatch`
`noneMatch` `findFirst` `findAny`
>stream().allMatch(Predicate<? super T> predicate)
>return boolean

>stream().anyMatch(Predicate<? super T>)
>return boolean

>stream().noneMatch(Predicate<? super T>)
>return boolean

> Operations allMatch, anyMatch, noneMatch is what called short-circuiting  

>stream().findFirst(Predicate<? super T>)
>return boolean

>stream().findAny(Predicate<? super T>)
>return boolean

> findAny and findFirst will return Optional<T>


## Optional class
-   The `Optional<T>` class __Java.util.Optional__
> ifPresent() return true 
> ifPresent(Consumer<T> block)
> T get() 
> T orElse(T)

## REDUCING


  
    
                 