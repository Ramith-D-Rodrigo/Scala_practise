//any number of auxilary constructors
//aux constructor call -> must call at least one other constructor (mostly primary)

class game(name: String, price: Int){
    def details(): Unit = {
        println(name + " "+ price.toString);
    }

    var vga: String = "GTX 1060";
    def this(name: String, price: Int, req: String)={
        //calling the primary constructor
        this(name, price);
        this.vga = req;
    }
    def moredetails(): Unit = {
        println(name+ " "+ price.toString+ " " + vga);
    }
}

object auxilary_constructors{
    def main(args: Array[String]): Unit = {
        val game1 = new game("NieR:Automata", 15);
        val game2 = new game("Rainbow Six Siege", 18, "GTX 1050 TI");

        game1.details();
        game2.details();
        game2.moredetails();

    }
}