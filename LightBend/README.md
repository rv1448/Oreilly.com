## LAMBDAS

- Functional Interfaces
- Lambdas
- Method References
- Best Practices

#### FUNCTIONAL INTERFACES

- Functional interfaces are single method interfaces
- They encapsulate a single behaviour
```java
import java.lang.Runnable;

@Functionalinterface
public Runnable{
void run();
}
```
- A functional interface is an interface with exactly one abstract interface
- Standard library contains many interfaces defined inside `java.util.function`
  * Consumer<T>
    * void accept(T t)
  * Supplier<T>
    * T get()
  * UnaryOperator<T>
    * T identity(T t)
  * Predicate<T>
    * boolean test(T t)
  * Function<T,R>
    * R apply(T t)
  * BiConsumer<T,U> -- Represents an operation that takes two arguments and returns no result
    * void accept(T t, U u)
  * BiFunction<T,U,R> -- Represents a function that accepts two arguments and produces a result
    *apply(T t, U u)

#### Lambda Functions
- Example of functional interface
``` java
@Functionalinterface
interface MyInterface {
ReturnType methodname(Functionparameters){
Functionbody
}
}
```
- They are defined in the form
`ReturnType value = (FunctionParameters) -> {Function Body}`

#### Common use of Lambdas

  * `java.util.stream.Stream`
    * .map - Applies a Function<T, R> to convert stream<T> to a Stream<R>
    * .filter - Applies a Predicate<T> to filter out any elements that don't
  * `java.util.concurrent.CompletableFuture`
    * .thenApply uses a callback Function<T,R> to convert a CompletableFuture<T> to CompletableFuture<R>
    * .thenAccept uses a callback Consumer<T> to consume the value of the Future when it completes



## Futures

#### What is Covered ?
  * This course covers:
    * Blocking Calls
    * Futures
    * Transforming Futures
    * Executors

  - Blocking Calls
  - 


**SPECIAL NOTES**
- Difference between Instant and LocalTime
