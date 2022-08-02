object function{
    import scala.io.StdIn._;

    def sum(a: Int, b: Int): Int = {
        return a + b;
    }

    def ex(a: Int, b: Int): Unit = {
        println("A: "+ a);
        println("B: "+ b);
    }

    def printNames(x: String*): Unit = {
        for(i <- x){
            println(i);
        }
    }

    def adder(a: Int = 10, b: Int = 45): Int = {
        return a + b;
    }

    def printfac(x: Int): Unit = {

        def fact(y: Int): Int = {
            if(y == 1) {
                1;   //without using return
            }
            else{
                y * fact(y - 1);
            }
        }
        println("Factorial of " + x + " = " + fact(x));
    }

    def partial_func(a: Int, b: String): Unit = {
        println(a.toString+ " "+ b);
    }

/*     def full_func(a: Int, b: String): Unit = {
        println(a.toString+ " "+ b);
    } */

    def main(args: Array[String]): Unit = {
/*         print("Enter a number: ");
        var x = readInt();
        print("enter another number: ");
        var y = readInt();
        print("Sum = " + sum(x,y)); */

        ex(b = 3, a = 4); //named arguments

        printNames("Dragon ball", "Gintama", "Ousama Ranking"); //variable arguments

        println(adder(69,20)); //default arguments

        printfac(8);    //nested functions

        var me = partial_func(78, _:String); //partial function, to later assign the string

        me("Rodrigo");

    }
}