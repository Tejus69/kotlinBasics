package eu.example.kotlinbasics

fun main(){
  var playerChoice = ""
  var computerChoice = ""

  println("Enter The Your Choice Between Rock Paper ANd Scissors")
  playerChoice = readln()

  var randomNumber = (1..3).random() // give random no. from 1 to 3

  // when its like a Switch cae

  when(randomNumber) {

    1 -> {
      computerChoice = "Rock"
    }

    2 -> {
      computerChoice = "Paper"
    }

    3 -> {
      computerChoice = "Scissors"
    }
  }

//  println(computerChoice)

  val winner = when {
    computerChoice == playerChoice -> "Tie"
     playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
    playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
   playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
     else -> "Computer"
  }

  if(winner ==  "Tie"){
        println("Ohh it's Tie !")
  }
  else
    println("$winner + is Winner")

}


