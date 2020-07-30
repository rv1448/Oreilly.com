package com.pluralsight

object SumTypes extends App {

  sealed trait TaskStatus
  case object Pending extends TaskStatus;
  case object Inprogress extends TaskStatus;
  case object Completed extends TaskStatus;


  case class Task(name:String, status:TaskStatus,isPriority:Boolean)

  def requiretask : TaskStatus = Inprogress;

  def getTaskStatus(task:Task): Unit = {
    val status = task.status;
    status match {
      case Pending if task.isPriority == true  => println(s"this task has top prirority ${task.name}")
      case Pending => println("Pending")
      case Inprogress => println("inprogress")
      case Completed => println("Completed")
    }

  }

  requiretask match {
    case Pending => println("Pending")
    case Inprogress => println("inprogress")
    case Completed => println("Completed")
  }

  val task1 = Task("task1",Pending,true)
  val task2 = Task("task2",Completed,true)
  val task3 = Task("task3",Inprogress,true)

  List(task1,task2,task3).map(getTaskStatus(_))


  def identity[T](value:T):T = value
  println(identity(12))
  println(identity("name"))





  val listtask = List(task1,task2,task3)


}
