object non_tail_factorial extends App{
    def factorial(a: Int): Int = a match {
        case 0 => 1;
        case _ => a * factorial(a - 1);
    }

    print(factorial(25));
}