object q2 extends App{
    val x = List(1,2,3,4,5)
    val f1 = (x:Int, y:Int) => x * y
    val y = x.reduce(f1)

    println(y)
}