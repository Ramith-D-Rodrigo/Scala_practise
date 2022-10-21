object q9 extends App{
    def fx(a:Int, b:Int): Int = if(b == 0) a else fx(b, a%b)

    println(fx(5,15))
}