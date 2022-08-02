object gcd extends App{
    def GCD(a:Int, b: Int):Int = b match {
        case 0 => a;
        case x if(x > a) => GCD(x, a);
        case x => GCD(x, a%x);
    }

    println(GCD(5,10));
}