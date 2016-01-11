package spatutorial.shared

import boopickle.Default._

sealed trait ToLearnPriority

case object ToLearnLow extends ToLearnPriority

case object ToLearnNormal extends ToLearnPriority

case object ToLearnHigh extends ToLearnPriority

case class ToLearnItem(id: String, timeStamp: Int, content: String, priority: ToLearnPriority, completed: Boolean)

object ToLearnPriority {
  implicit val toLearnPriorityPickler: Pickler[ToLearnPriority] = generatePickler[ToLearnPriority]
}
