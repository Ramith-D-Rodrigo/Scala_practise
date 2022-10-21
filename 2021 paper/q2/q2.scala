object q2 extends App{
    def isPrime(n: Int, s: Int = 2): Boolean = n%s match{
        case x if(n == 1) => false
        case x if(s == n) => true
        case 0 => false
        case x if(x != 0) => isPrime(n, s+1)
    }   
    println(isPrime(12));
    println(isPrime(13));
}