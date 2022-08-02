object currying extends App{
    val add = (x: Int) => (y:Int) => x + y;
    val mult = (x: Int) => (y:Int) => x * y;

    println(add(2)(5));
    println(mult(2)(5));
}