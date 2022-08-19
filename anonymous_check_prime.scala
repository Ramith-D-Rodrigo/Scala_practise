object anonymous_check_prime extends App{
    val isPrime = (n: Int) => (2 to Math.sqrt(n).toInt).filter(n%_ == 0).size == 0;

    val intermediate_func_1 = (n: Int) => (2 to Math.sqrt(n).toInt);
    val intermediate_func_2 = (n: Int) => (2 to Math.sqrt(n).toInt).filter(n%_ == 0);

    println(isPrime(2).toString() + "\t" + intermediate_func_1(2) + "\t" + intermediate_func_2(2));
    println(isPrime(5).toString() + "\t" + intermediate_func_1(5) + "\t" + intermediate_func_2(5));
    println(isPrime(7).toString() + "\t" + intermediate_func_1(7) + "\t" + intermediate_func_2(7));
    println(isPrime(9).toString() + "\t" + intermediate_func_1(9) + "\t" + intermediate_func_2(9));
}