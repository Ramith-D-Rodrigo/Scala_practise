object non_tail_int_pattern_reverse extends App{
    def printPattern(n: Int): Unit = n match{
        case n if(n == 1) => println(n);
        case _ => {
            print(n);
            printPattern(n-1);
        }
    }

    def pattern(n: Int): Unit = {
        for(i <- 1 to n){
            printPattern(i);
        }
    }

    pattern(10);
}