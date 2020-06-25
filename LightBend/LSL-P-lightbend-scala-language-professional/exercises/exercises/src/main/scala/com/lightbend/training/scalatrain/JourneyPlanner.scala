package com.lightbend.training.scalatrain

class JourneyPlanner(trains:Seq[Train]) {
  val stations:Set[Station] = trains.flatMap(_.stations)

  def trainsAt(station:Station):Set[Train] = trains.filter(train => train.stations.contains(station))


  def stopsAt(station:Station):Set[(Time,Train)] =
    for{
      train <- trains
      timeAndStation <- train.schedule if timeAndStation._2 ==  station
    } yield timeAndStation._1 -> train
}
