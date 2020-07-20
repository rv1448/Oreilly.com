
## SCALA IS AN EXPRESSION-ORIENTED PROGRAMMING

 - Whats the difference between expression and statement ? 
    * A statement gets executed with out a return statement, Purely for its side effects
    * In java something is a result of an if stament in java
    * we have to change the external state once we go into the loop

#### CODE BLOCKS
 - Code blocks are expressions
    * THe return value of the block is determined by the last expression of the block
    * in this example the result of the block is the value of the expression

#### OO basics
  - Classes and Traits(java Interfaces)
    - Fields keep state(classes and interfaces)
    - Method provides operations(encapsulations)
  - Singleton Objects are first-class objects
  - Inheritance
    - Single inheritance, i,e extend one super
    - Multiple traits can be mixed in
  - Primary constructor
    ``` scala
    class Hello{
    println("Hello")
    }
    ```
    - here println becomes part of the constructor

#### GET THE COMPILED CODE

  - Get the compiled code from a scala class
  - ``` scala
    javap -c Train
    java -p Train
    ```

#### PROMOTE CLASS PARAMETERS TO FIELDS
  - Adding val or var before a class parameter
    * Creates a field
    * Initializes the field with the value of the parameter

#### INFIX OPERATORS
  - no .method and parentheses
  - Methods with one parameter can be used in infix notation

## POSTFIX OPERATOR
## PREFIX OPERATOR
`!true equals true.unary_!`


#### Running an Application



## COLLECTION


## Functional Collections














****SPECIAL NOTES****

:cp <PATH>    add a JAR or directory to the class path
:help
:javap <path|class> disassemble a file or class name
