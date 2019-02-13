package com.spark.scala

object ScalaVsJ {

  def main(args: Array[String]): Unit = {

    val string = "This is the way this done and this is the waya that will be "
    println(string.split(" ").filter( _ == "this").size)

    // imperative paradigm: First do this then do that
    // Functional paradigm: Evaluate and use
    // Logical Paradigm: Answer through solution
    // Object-Oriented Paradigm: Send messages between objects to simualte temporal evolution of a set of
        //real-world phenomena
    // FUnctional programming is not an imperative programming

    // First class Citizens Meaning they can treated like variables\
    // In functional language like scala a  function is an object
    // A => B this means this funtion takes A as an input and outputs B
    // In functional programming inputs are transformed to outputs
    // If you are performing square of a number => and printing to the screen
    // you are doing more than transforming the data. ANd a function only transforms the data


    // Scala is a mixture of functional and object-oriented worlds. It gives two benefits.
    // First, you can leverage the power of functional constructs: Higher-order functions, Nested Functions
    // Pure Functions and closures.

    /* ASYNCHRONOUS CODE:
     * Simply defined Asynchronous code is where your program control returns
     * immediately after calling a block of instructions(this is a function), Having started some parallel/background
     * effort to complete your request. This means your program flow will not stop because of certain function
     * is taking time to complete
     */

    /**
      * Asynchronous versus parallel versus concurrent programming
      * Asynchronous involves some calculations and time-intensive tasks, WHICH ON THE ONE HAND ARE ENGAGING A THREAD
      * IN THE BACKGROUND BUT DO NOT AFFECT THE NORMAL flow of the program
      *
      * Parallel programming incorporates several threads to perform a task faster and so does concurrent programming
      * But there is a subtle difference between these two.
      *
      * SINGLETON OBJECT:
      * an object in scala is an singleton container of code which cannot take any parameters
      * You are not allowed to create instances of obhec.
      *
      * BUILDING BLOCKS OF SCALA
      * Val and Var keywords
      * Literals
      * Data Types
      * Type Inference
      * Operators
      * Wrapper Classes
      * String Interpolation
      *
      * Any Class you define in scala is a subclass of AnyRef
      *
      *
      * Function Literal
     */
    val answer = new Function[Int,Int] {
      def apply(x:Int): Int = x * 2
    }


    def square(x:Int):Int = {
      println(x *x)
      x * x
    }

    val double:(Int => Int) = _ *2

    (1 to 10).foreach(double.andThen(println))

    /**
      * FUNCTION LITERAL: are a syntactical way of representing a function. The basic structure of a function
      * is something that can take some parameters and return a response.
      * Int => String
      * Take input as Int and Respond with String
      * The Type of preceding function literal is Function1[Int, String]
      */

    /**
      * in java there are primitive types and in scala you have value types
      * an instance of value types are objects and they have reference
      */


    /**
      * ANY is root class of scala
      */

  }

}


/*
object forloop {
  def main(args: Array[String]): Unit = {
    println("hello world")
  }
}*/ /* Cannot define multiple objects in a same file */
