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




**SPECIAL NOTES**
- Difference between Instant and LocalTime
