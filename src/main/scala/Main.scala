import scala.io.StdIn.readLine

@main def main: Unit = 
  println("Welcome to my quiz!")
  println("Let's begin!")
  
  for q <- questions do  
    askQuestion(q)
    val answer = takeAnswer()
    println(if checkAnswer(answer, q) then "Correct!" else "Wrong answer!")
    println()




case class Question(
  text : String,
  answers: Seq[String],
  correct: "a" | "b" | "c" | "d"
)

def askQuestion(q : Question) : Unit = 
  println(q.text)
  println("Answers: ")
  q.answers.map(
    println(_)
  )

def takeAnswer() : String = 
  print("What's your answer: ")
  readLine()

def checkAnswer(a: String, q: Question) : Boolean = 
  if a.length() == 1 then
    if a == q.correct then
      return true
  false


val questions = List(
  Question("1. What does \"print\" do?", List("a) outputs text to screen", "b) takes input from user", "c) sums list of numbers", "d) sends info to printer"), "a"),
  Question("2. Which variable is used to store true or false values?", List("a) int", "b) String", "c) Boolean", "d) Float"), "c")
  )
  
