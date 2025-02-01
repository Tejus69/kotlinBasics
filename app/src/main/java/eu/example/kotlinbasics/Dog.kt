// its a syntax of class in kotlin

package eu.example.kotlinbasics

class Dog(val name: String ,val breed : String ) {
    init{
        bark(name)
    }

    fun bark(name: String){
        println("$name saying WHoo WHooo Whoo WHooo and his breed is $breed")
    }
}

fun main(){
     val obj = Dog("Simba" , "Lab")

}