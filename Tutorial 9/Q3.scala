object Q3 {
  class Account(initialBalance: Double) {
    private var balance: Double = initialBalance

    def getBalance: Double = balance

    def deposit(amount: Double): Unit = {
      if (amount > 0) {
        balance += amount
        println(s"Deposited $amount. New balance: $balance")
      } else {
        println("Invalid deposit amount")
      }
    }

    def withdraw(amount: Double): Unit = {
      if (amount > 0 && amount <= balance) {
        balance -= amount
        println(s"Withdrew $amount. New balance: $balance")
      } else {
        println("Invalid withdrawal amount")
      }
    }

    def transfer(toAccount: Account, amount: Double): Unit = {
      if (amount > 0 && amount <= balance) {
        balance -= amount
        toAccount.deposit(amount)
        println(s"Transferred $amount to ${toAccount.toString}. New balance: $balance")
      } else {
        println("Invalid transfer amount")
      }
    }

    override def toString: String = s"Account balance: $balance"
  }


def main(args: Array[String]): Unit = {
    val account1 = new Account(1000.0)
    val account2 = new Account(500.0)

    println("Initial account states:")
    println(account1)
    println(account2)

    account1.deposit(200.0)
    account2.withdraw(100.0)

    println("\nAccount states after transactions:")
    println(account1)
    println(account2)

    account1.transfer(account2, 300.0)

    println("\nAccount states after transfer:")
    println(account1)
    println(account2)
  }
}
