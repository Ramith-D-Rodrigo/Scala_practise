object q4 extends App{
    val divisor3 = (x: List[Int]) => x.filter( _ % 3 == 0)
    val mylist = List(1,2,3,4,5)

    val result = divisor3(mylist)
    println(result)
}