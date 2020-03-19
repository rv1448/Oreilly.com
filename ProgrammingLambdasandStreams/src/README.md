## GENERICS

* Wildcard with Extends
    ```java
    interface Collection<E>{
  public boolean addAll(Collection< ? extends E> c);
  }
  /* " ? extends E" means that it ok to add 
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
 
| Month    | Assignee |
| Month    | Assignee |
| Month    | Assignee |
| Month    | Assignee |
## Comparator
## Functions

`package java.util.Function`
  
  