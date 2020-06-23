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
  - Blocking is inevitable in most systems
  - To maintain performance and scalability we can isolate blocking operations
  - Futures allow us to isolate blocking operations to a seperate thread
  - Execution of the main thread continues uninterrupted
  - The result of the future is handled through a `callback`
  - __Futures represent the promise of a value__

```
====Main Thread===
=======Exec=======
==================
==================
=Future(Blocking)=   ->   new Thread  ->   Thread2
====Exec Cont..===                     ====Blocking===
====Exec Cont..===                     ====Blocking===
====Exec Cont..===                     ====Blocking===
====Exec Cont..===                            |
====Exec Cont..===                     new Thread3
====Exec Cont..===                     ===Call back===
```

## What is CompletableFuture ??
  - CompletableFuture is used for asynchronous programming in Java. Asynchronous programming is a means of
    writing non-blocking code by running a task on a Seperate thread than the main application thread and
    notifying the main thread about its progress, Completion or Failure.
** CompletableFuture implements two interfaces
  - Future
  - CompletionStage

  - in java promise of a value is represented by a CompletableFuture
  - CompletableFuture is an implementation of CompletionStage

## Creating a Completed Future
``` java
CompletableFuture<Order> futureorder = CompletableFuture.completedFuture(new Order())

```

## Creating a Eventually Completed Future
  - We often need to transform, or process the result of the failure
  - Instead of waiting for it to complete, A completableFuture can be transformed using .thenApply
  - If the original Future completed with an Exception, then the transformed future will complete with same exception
``` java
CompletableFuture<Order> futureOrder = CompletableFuture.supplyAsync(() -> {
          new Order();
          };

Order order1 = futureOrder.get();
Order order2 = futureOrder.join();
```


## Transforming Futures

``` java

CompletableFuture<String> futureString = futureOrder.thenApply(order -> order.toString());
```

## Executors

  - Futures are executed in a seperated thread or Thread pool
  - Management of these threads is handled by an Executor or ExecutorService



**SPECIAL NOTES**
- Difference between Instant and LocalTime
