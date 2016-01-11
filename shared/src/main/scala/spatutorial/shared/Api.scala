package spatutorial.shared

trait Api {
  // message of the day
  def welcome(name: String): String

  // get Todo items
  def getTodos(): Seq[TodoItem]

  // update a Todo
  def updateTodo(item: TodoItem): Seq[TodoItem]

  // delete a Todo
  def deleteTodo(itemId: String): Seq[TodoItem]

  // get ToLearn items
  def getToLearns(): Seq[ToLearnItem]

  // update a ToLearn
  def updateToLearn(item: ToLearnItem): Seq[ToLearnItem]

  // delete a ToLearn
  def deleteToLearn(itemId: String): Seq[ToLearnItem]
}
