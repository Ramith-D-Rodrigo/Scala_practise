object q6 extends App{
    case class Point(x: Int, y:Int){
        val add= x+y;
        val mul= x*y;
    }

    val p1 = Point(2,3)
    val p2 = Point(3,4)
    val p3 = Point(p1.add, p2.mul)

    println(p3)
}