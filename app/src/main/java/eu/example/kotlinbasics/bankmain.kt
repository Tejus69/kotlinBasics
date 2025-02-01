// its a basic finance stuff and checking transactions and other


package eu.example.kotlinbasics

fun main(){
    // creating object of baankDetails Class

    val rajuBankAccount = bankDetails("Raju", 1027.34)

   println(" current balnce is  ${rajuBankAccount.balance}")
    rajuBankAccount.deposit(500.2)
    rajuBankAccount.withdraw(300.56)


    rajuBankAccount.checkTransactionHistory()
}