object q1 extends App{
    val factorial = (x:Array[Int]) => x.reduce((x,y) => x*y);
    println(factorial((1 to 10).toArray))
}