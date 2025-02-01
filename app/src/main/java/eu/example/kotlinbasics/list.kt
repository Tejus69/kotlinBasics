// learning about list and its syntax

package eu.example.kotlinbasics

fun main(){

    // immutable lists

    // this list can contain all DataTypes we cant add more items once it creats
    val list1 = listOf("Ramesh", "Raju", "Shyam", 1.3,5)

    // this list can contain only elements of only one specific DataType which is defined in  "< >"
    val list2 = listOf<Int>(1,2,3,56,6,667)

    // upper two lists are immutable list not because of val keyword its due to that "listOf()" method


    // Mutable List

    // in this list we can add modify its elements and it can store elements of any Dataype
    val list3 = mutableListOf("Ramesh", "Raju", "Shyam", 1.3,5)

    //functions
     list3.add("Baburao")
     list3.remove("Ramesh")


    // Mutable list that can contain one specific DataType

    val list4 = mutableListOf<Char>('A','B','*','@')

    //functions
    list4.add('q')
    list4.remove('@')
    list4.removeAt(2)        // removal at particular index
    list4.add(2,'T') // Adding at particular Index

    println(list4[3]) // printing element at a Index

    // set Method : it replace a element at index that are defined as parameter
    list4.set(3,'&')

     // contains method : it checks is our list contains a particular element  and it  returns a boolean value
    list4.contains('A')


    // Printing an list
    println(" printed using println")
    println(list3)


    // for Loops With list
    println(" printed using for each loop")
    for(item in list3){
        println(item)
    }
    // if i wanna print items of list till particular item
    println(" printing using for each loop and till specific element  ")
    for(item in list3){
        println(item)
        if(item == 5){
            break
        }
    }

    // size func: it returns the no. of elements of an list
//    println(list3.size)

    // printing using for loop by indexing
    println(" printed using for loop by indexing")
    for(index in 0 until  list3.size){
             println(list3[index])
    }



}
