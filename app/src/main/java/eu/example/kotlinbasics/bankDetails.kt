package eu.example.kotlinbasics

class bankDetails(var accountHolderName:String ,var balance : Double ) {

    private val transactionHistory = mutableListOf<String>()
    fun deposit(amount:Double ){
        balance += amount
        transactionHistory.add("$accountHolderName deposited RS.$amount")
    }
    fun withdraw(amount:Double){
           if(amount > balance){
               println("Not enough balance in Your Account ")
           }
        else{
               balance -= amount
               transactionHistory.add("$accountHolderName withdrew RS.$amount")
           }
    }

    fun checkTransactionHistory(){

        for(transaction in transactionHistory){
            println(transaction)
        }
    }
}