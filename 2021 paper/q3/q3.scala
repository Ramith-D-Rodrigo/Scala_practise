object q3 extends App{
    val fx = (x: Int) => (y:Int) => x*y;
    val x =List(1,2,3,4,5);
    val y = x.map((x)=> fx(x)(2))
    println(y)
}