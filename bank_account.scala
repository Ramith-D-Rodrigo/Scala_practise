object bank_account extends App{

    class Account(id: String, n: Int, b: Double){
        def nic = id;
        def acc_number = n;
        def balance = b;

        override def toString(): String = "[" + nic + " : " + acc_number +" : " + balance + "]";

        def withdraw(a: Double):Unit ={
            this.balance = this.balance - a;
        }

        def deposit(a: Double): Unit = {
            this.balance = this.balance + a;
        }

        def transfer(a: Account, b: Double): Unit = {
            a.deposit(b);
            withdraw(b);
        }
    }

    var bank :List[Account] = List();
    val acc = new Account("200024501510",300, 50000);
    bank = bank :+ acc;
    println(bank.toString());
}