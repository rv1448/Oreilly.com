## Functional Programming
> PurchaseList = ??? - list of food purchases with different categories 
> Question: filter list where category == food

> filter(hasCategoryFood, PurchaseList)
> hasCategoryFood(purchase) = purchase.category == food

## foldFromLeft and foldFromRight
- folding is an reducing operation and terminal operation  
- seeding value is substracted from first value  
- The resultant value is subtracted from second value  
>foldFromLeft(function,seedingvalue,List);
>foldFromLeft(minus,0,[10,20,14,12,5])

    <!--   0 - 10 = -10 -->
    <!-- -10 - 20 = -30 -->
    <!-- -30 - 14 = -44 -->
    <!-- -44 - 12 = -56 -->
    <!-- -56 - 5  = -61 -->
    
- folding from right takes the last element and apply's Binary operation with seeding value
- Second value from last is applied on the resultant value
>foldFromRight(function,seedingvalue,List);
>foldFromRight(minus,0,[10,20,14,12,5])

    <!--  5 - 0 = 5 -->
    <!-- 12 - 5 = 7 -->
    <!-- 14 - 7 = 7 -->
    <!-- 20 - 7 = 13 -->
    <!-- 10 - 13 = -3 -->

    
## PURE FUNCTIONS 
> print "BEFORE: "   
> print x  
-- BEFORE: 27 <br>
> y = calculate() <br>
> print "AFTER: " <br>
> print y  <br>
-- AFTER: 81

- `Side Effect` occurs when evaluating an expression interacts with something 
    other than the expression itself.
- A pure function has no side effects.
    - The function doesn't use any value outside of it other than to take parameters
    - The function doesn't change any values outside of it other than to return a result
    - Pure function doesn't print to external environments
- `Referential transparant` A expression in referentially transparent if you can substritute
    expression value with the expression itself, and not change the meaning of the program.       
> print(getRandom()+getRandom()) 1 + 6 <br>
> x = getRandom() <br>
> print(x+x)  <> 7 <br>

## IMMUTABILITY 

- Imperative style to sum 

>total = 0 <br>
>for each purchase in purchaseList: <br> 
>   if purchase.category == food <br>
>       total = total +purchase.amount --> this is mutable variable :(  <br>
>print total <br>

- Functional Style to Sum
>print(sum(map(getAmount,filter(Lambda purchase -> (purchase.category==food),purchaseList))))
* EVERY FUNCTION RETURNS A NEW list and final SUM returns new Value
                                                                                                                                                                                                  

 


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

## NUMERIC STREAMS
> transaction.stream().map(Transaction::getValue).reduce(0,Integer::sum)

Problem with this code is that there is a boxing cost. <br>
Each Integer needs to be unboxed to premitive type before performing the
summation <br>
Stream<T> interface doesn't have sum() method defined in it. Imagine if the stream 
has object of Dish, and we cannot sum them. 


## NUMERIC RANGES
> IntStream.rangeClosed(1,100).filter(n -> n%2 ==0);


## COLLECTING DATA WITH STREAMS
- Creating and Using `Collectors` class
    - Collect is a terminal operation like reduce operation
    - Collector is a new Interface 
    - collect() method takes Collector 
- Reducing stream to a single value
- Summerization as a special case of reduction
- Grouping and partitioning data 
- Developing OWN custom collectors 
    
## COLLECTORS FACTORY CLASS

> Collectors is an Implementation of Collector interface
> Collect takes a Collector and Collectors and most implementations out of the box
> Collect triggers a reduction on the Streams 
> Arguements passed to the collect method is implementation of Collector interface
> COllector applies a transformation function. Quite often its a identity transformation
>
```java
- Instance of Transaction Exchange Class 
TransactionExchange t = new TransactionExchange(Currency.EUR, 1500.0);
// transactions is a List of TransactionExchange

- imperative style of programming

Map<Currency, List<Double>> groupbyCurrency= new HashMap<>());
for(TransactionExchange e: transactions)
{
    groupbyCurrency.getOrDefault(t.getCurrency(),new ArrayList()).add(e.getValue())
}

- FunctionalStyle
transactions.stream()
            .collect(Collectors.groupingBy(TransactionExchange::getCurrency))

```
## PREDEFINED COLLECTORS

#### COLLECTORS class
- Reducing and Summerizing stream elements to a single value 
- Grouping Elements 
- Partitioning Elements

1) REDUCING AND SUMMARIZING

> transaction.stream().collect(Collectors.counting())

> `<T> static Collector<T,?,Long count()
  {return summinglong(e -> 1L)}`
<pre>
public static <T> Collector<T, ?, Long>
     summingLong(ToLongFunction<? super T> mapper) {
         return new CollectorImpl<>(
                 () -> new long[1], -- supplier
                 (a, t) -> { a[0] += mapper.applyAsLong(t); }, --accumulator
                 (a, b) -> { a[0] += b[0]; return a; }, combiner
                 a -> a[0],  finisher 
                CH_NOID); characteristics
</pre>
<pre>
CollectorImpl(Supplier<A> supplier,
                       BiConsumer<A, T> accumulator,
                       BinaryOperator<A> combiner,
                       Function<A,R> finisher,
                       Set<Characteristics> characteristics)
</pre>

 


  
    
                 