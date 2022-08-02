object evenity_check extends App{
    def isEven(n: Int): Boolean = n match{
        case 0 => true;
        case _ => isOdd(n-1);
    }

    def isOdd(n: Int): Boolean = !isEven(n);

    println(isEven(19));
    println(isOdd(21));
}