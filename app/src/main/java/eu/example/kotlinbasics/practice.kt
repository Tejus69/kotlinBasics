// its just a practise for getting hands on with the kotlin functions syntax


package eu.example.kotlinbasics


 // function with no return val
fun makeCoffee(name:String , sugarCount:Int ){

    if(sugarCount >= 1){
        println("Coffee With $sugarCount for $name")
    }
    else if(sugarCount == 0){
        println("Coffee with no sugar for $name")
    }
}


// function with return val
fun add(num1:Int , num2:Int):Int{
    return  num1 + num2
}
fun main(){
// println("Who is the Coffee for ?")
//    val name = readln()
//
// println("How many pieces of sugar do you want ?")
//    val sugarCount = readln().toInt() // toInt() fun is used here for converting input into integer value cuz readln() fun always take input as string
//
//  makeCoffee(name,sugarCount)

println(" ENter the 1st and 2nd val ")
    val num1 = readln().toInt()
    val num2 = readln().toInt()

    println("Sum is : " + add(num1,num2))
}

