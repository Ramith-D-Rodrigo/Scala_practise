object non_tail_int_pow extends App{
    def power(a: Int, b: Int): Int = b match{
        case 0 => 1;
        case _ => power(a, b - 1) * a;
    }

    println(power(2,10));
}