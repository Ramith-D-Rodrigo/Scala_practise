object anonymous_random extends App{
    val rand = (n: Int) => scala.util.Random.nextInt(n);

    println(rand(50));
    println(rand(50));
    println(rand(50));
    println(rand(50));
    println(rand(50));
    println(rand(50));
    println(rand(50));
}