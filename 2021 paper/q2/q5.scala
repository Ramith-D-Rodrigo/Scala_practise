object q5 extends App{
    val coupon = (code: List[String]) => code.foreach(i => println(i + "-" + i.length))
    val couponlist = List("A", "BB", "CCC", "DDDD", "EEEEE")

    coupon(couponlist)
}