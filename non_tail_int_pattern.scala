object non_tail_int_pattern extends App{
    def pattern(n: Int): Unit = {
        for(i <- 1 to n){
            printPattern(i)
        }
    }

    def printPattern(n: Int, m: Int = 1): Unit = m match{
        case m if(m == n) => println(m)
        case _ => {
                    print(m);
                    printPattern(n, m+1);
                }
    }

    pattern(10);
}